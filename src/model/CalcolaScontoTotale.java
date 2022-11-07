package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class CalcolaScontoTotale extends CalcolaSconto {
	private static final String SQL_SET_SCONTO_TOTALE=
			"SELECT * "
			+ "FROM offerte.offerta "
			+ "WHERE Fornitore=? AND Magazzino>=? AND Prodotto=? AND scontoTotale='Y' AND importo<=?";
			
	public static Offerte TrovaMiglioreScontoTotale(String nomeFornitore,String nomeProdotto,int quantita,float Prezzo)
	{
		List<Offerte> lista= new ArrayList<>();
		PreparedStatement stmt ;
		Connection con = ConnectionManager.getConnection();
		 ResultSet rs = null;
		 try {
			 stmt=con.prepareStatement(SQL_SET_SCONTO_TOTALE);
			 stmt.setString(1, nomeFornitore);
			 stmt.setFloat(2,(float)quantita);
			 stmt.setString(3, nomeProdotto);
			 stmt.setFloat(4, quantita*Prezzo);
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
