package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class CaricaInDB {
	
	
	
	
	private static final String SQL_CARICA= "INSERT INTO offerte.offerta "
			+ "(Fornitore, Prodotto,Prezzo,Magazzino,Percentuale,scontoQuantita,Quantita,scontoTotale,Importo,scontoStagione,Stagione,Spedizione)"
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
	
	
	
	
	
	public static void carica(OffertaSingola nuova) {
		PreparedStatement stmt ;
		Connection con = ConnectionManager.getConnection();
		 
		 try {
			 stmt=con.prepareStatement(SQL_CARICA);
			 stmt.setString(1, nuova.getFornitore());
			 stmt.setString(2, nuova.getProdotto());
			 stmt.setFloat(3, nuova.getPrezzo());
			 stmt.setFloat(4, nuova.getMagazzino());
			 stmt.setFloat(5, nuova.getPercentuale());
			 stmt.setString(6,getbooleanValue(nuova.isScontoQuantità()));
			 stmt.setInt(7, nuova.getQuantita());
			 stmt.setString(8,getbooleanValue(nuova.isScontoImporto()));
			 stmt.setFloat(9, nuova.getImporto());
			 stmt.setString(10, getbooleanValue(nuova.isScontoStagione()));
			 stmt.setString(11, nuova.getStagione());
			 stmt.setInt(12, nuova.getSpedizione());
			 
		stmt.execute();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	public static String getbooleanValue(boolean condizione) {
		if(condizione) {
			return "Y";
		}else {
			return "N";
		}
	}



	

}
