package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeterminaStagione 
{

	public static String determinaStazione(Date nuovo) {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 String stagione="nessuno";
		try {
			if(nuovo.after(formatter.parse("21/06/2022")) && nuovo.before(formatter.parse("22/09/2022"))) {
				stagione="estate";
				
			}else if(nuovo.after(formatter.parse("23/09/2022")) && nuovo.before(formatter.parse("20/12/2022"))) {
				stagione ="autunno";
			}
			else if(nuovo.after(formatter.parse("21/12/2022")) && nuovo.before(formatter.parse("19/03/2023"))) {
				stagione ="inverno";
			}else if(nuovo.after(formatter.parse("10/03/2023")) && nuovo.before(formatter.parse("20/06/2023"))) {
				stagione ="primavera";
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return stagione;
	}
	
}
