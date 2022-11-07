package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalcolaScontoStagione extends CalcolaSconto{
	private static final String SQL_SET_SCONTO_STAGIONE=
			"SELECT * "
			+ "FROM offerte.offerta "
			+ "WHERE Fornitore=? AND Magazzino>=? AND Prodotto=? AND scontoStagione='Y' AND Stagione=?";
	public static Offerte TrovaMiglioreScontoStagione(String nomeFornitore,String nomeProdotto,int quantita)
	{
		List<Offerte> lista= new ArrayList<>();
		PreparedStatement stmt ;
		Connection con = ConnectionManager.getConnection();
		 ResultSet rs = null;
		 
		    Date date = new Date();  
		    String stagione= DeterminaStagione.determinaStazione(date);
		    
		   
		 try {
			 stmt=con.prepareStatement(SQL_SET_SCONTO_STAGIONE);
			 stmt.setString(1, nomeFornitore);
			 stmt.setFloat(2,(float)quantita);
			 stmt.setString(3, nomeProdotto);
			stmt.setString(4, stagione);
			rs= stmt.executeQuery();
			while(rs.next()) {
				
			lista.add(new Offerte(rs.getFloat("Percentuale"),rs.getInt("Spedizione")));
				
			}
			rs.close();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(lista.isEmpty()) {
			 return null;
		 }else {
		
		return comparaPercentuale(lista);}
	}
	
	
	
	
}
