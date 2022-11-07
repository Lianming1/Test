package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Comparatore 
{
	private String nomeProdotto;
	private int Quantita;
	private List<Fornitore> listaFornitori;
	
	private static final String SQL_NOMI_FORNITORI="SELECT DISTINCT Fornitore,Prezzo FROM offerte.offerta";
	public Comparatore(String nome, int quantita) {
		
		setNomeProdotto(nome);
		setQuantita(quantita);
		this.listaFornitori= new ArrayList<>();
		inizializzaListaFornitore();
	}

	private void inizializzaListaFornitore() {
		PreparedStatement stmt ;
		Connection con = ConnectionManager.getConnection();
		 ResultSet rs = null;
		 try {
			 stmt=con.prepareStatement(SQL_NOMI_FORNITORI);
			rs= stmt.executeQuery();
			while(rs.next()) {
				String nomeFornitore=rs.getString("Fornitore");
				Fornitore nuovo= new Fornitore(nomeFornitore);
				nuovo.inizializzaOfferte(nomeProdotto, Quantita, rs.getFloat("Prezzo"));
				listaFornitori.add(nuovo);
				
			}
			rs.close();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("qui");
		 
		 
		
	}
	public List<Proposta> cercaProposte() {
		List <Proposta> lista= new ArrayList<>(); 
		for(Fornitore x: listaFornitori) {
			if(x.getTotaleProposta()!=null)
			{
			lista.add(x.getTotaleProposta());
			}
		}
		return lista;
	}

	public int getQuantita() {
		return Quantita;
	}

	public void setQuantita(int quantita) {
		Quantita = quantita;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}
}
