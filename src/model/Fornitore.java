package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Fornitore {
	private String NomeFornitore;
	private List<Offerte> listaOfferte;
	private Proposta totaleProposta;
	public static final String SQL_PREZZO= "SELECT Prezzo FROM offerte.offerta WHERE Fornitore=? AND Prodotto=? AND Magazzino>=?";
	public static final String SQL_GIORNI_SPEDIZIONE="SELECT Spedizione FROM offerte.offerta WHERE Fornitore=? AND Prodotto=? AND Magazzino>=?";
	public Fornitore(String nome) {
		setNomeFornitore(nome);
	   listaOfferte= new ArrayList<>();
	}
	
	public void inizializzaOfferte(String nomeProdotto,int quantita){
		int giorniSpedizioneNormali=GiorniSpedizione(nomeProdotto, quantita);
		Offerte offertaQuantita=CalcolaScontoQuantitaMigliore.TrovaMiglioreScontoQuantita(NomeFornitore,nomeProdotto, quantita);
		if(offertaQuantita!=null) {
		listaOfferte.add(offertaQuantita);
		}
		float Prezzo = recuperaPrezzo(nomeProdotto, quantita);
		Offerte offertaTotale= CalcolaScontoTotale.TrovaMiglioreScontoTotale(NomeFornitore,nomeProdotto, quantita, Prezzo);
		if(offertaTotale!=null) {
			listaOfferte.add(offertaTotale);
			}
		Offerte offertaStagione=CalcolaScontoStagione.TrovaMiglioreScontoStagione(NomeFornitore, nomeProdotto, quantita);
		if(offertaStagione!=null) {
			listaOfferte.add(offertaStagione);
		}
		if(Prezzo !=0) {
		formulaProposta(quantita, Prezzo, giorniSpedizioneNormali);
		
		}
	}
	public void formulaProposta(int quantita, float prezzo,int giorniSpedizione) 
	{
		float totale= quantita*prezzo;
		float fisso = quantita*prezzo;
		int giorniSpedizioneOfferte=0;
		if(listaOfferte.isEmpty()) {
			
			Proposta ultima= new Proposta(NomeFornitore, totale, giorniSpedizione);
			setTotaleProposta(ultima);
		}else {
		for(Offerte x: listaOfferte) {
			
			totale=totale - (fisso*x.getPercentuale()/100);
			if(giorniSpedizioneOfferte==0) {
				giorniSpedizioneOfferte=x.getGiorniSpedizione();
			}else if(giorniSpedizioneOfferte>x.getGiorniSpedizione()) {
				giorniSpedizioneOfferte=x.getGiorniSpedizione();
			}
			
		}
		Proposta ultima= new Proposta(NomeFornitore, totale,giorniSpedizioneOfferte);
		setTotaleProposta(ultima);
		}
	}
	public int GiorniSpedizione(String nomeProdotto, float quantita) {
		int giorniSpedizione=0;
		PreparedStatement stmt ;
		Connection con = ConnectionManager.getConnection();
		ResultSet rs = null;
		try {
			 stmt=con.prepareStatement(SQL_GIORNI_SPEDIZIONE);
			 stmt.setString(1, this.NomeFornitore);
			 stmt.setString(2, nomeProdotto);
			 stmt.setFloat(3, quantita);
			rs= stmt.executeQuery();
			while(rs.next()) {
				
			 if(giorniSpedizione<=rs.getInt("Spedizione")) {
				giorniSpedizione= rs.getInt("Spedizione");
			 }
			}
		
			rs.close();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return giorniSpedizione;
	}
	public float recuperaPrezzo(String NomeProdotto, int quantita) {
		float Prezzo=0;
		PreparedStatement stmt ;
		Connection con = ConnectionManager.getConnection();
		ResultSet rs = null;
		try {
			 stmt=con.prepareStatement(SQL_PREZZO);
			 stmt.setString(1, this.NomeFornitore);
			 stmt.setString(2, NomeProdotto);
			 stmt.setInt(3, quantita);
			rs= stmt.executeQuery();
			while(rs.next()) {
				
				Prezzo=rs.getFloat("Prezzo");
			}
		
			rs.close();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Prezzo;
	}
	public String getNomeFornitore() {
		return NomeFornitore;
	}
	public void setNomeFornitore(String nomeFornitore) {
		NomeFornitore = nomeFornitore;
	}

	public Proposta getTotaleProposta() {
		return totaleProposta;
	}

	public void setTotaleProposta(Proposta totaleProposta) {
		this.totaleProposta = totaleProposta;
	}

}
