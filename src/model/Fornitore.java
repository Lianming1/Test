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
	public Fornitore(String nome) {
		setNomeFornitore(nome);
	   listaOfferte= new ArrayList<>();
	}
	
	public void inizializzaOfferte(String nomeProdotto,int quantita){
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
		if(listaOfferte.isEmpty()) {
			totaleProposta=null;
		}
		if(!listaOfferte.isEmpty()) {
			formulaProposta(quantita,Prezzo);
		}
		
		
	}
	public void formulaProposta(int quantita, float prezzo) 
	{
		float totale= quantita*prezzo;
		float fisso = quantita*prezzo;
		int giorniSpedizione=0;
		for(Offerte x: listaOfferte) {
			
			totale=totale - (fisso*x.getPercentuale()/100);
			if(giorniSpedizione==0) {
				giorniSpedizione=x.getGiorniSpedizione();
			}else if(giorniSpedizione>x.getGiorniSpedizione()) {
				giorniSpedizione=x.getGiorniSpedizione();
			}
			
		}
		Proposta ultima= new Proposta(NomeFornitore, totale,giorniSpedizione);
		setTotaleProposta(ultima);
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
