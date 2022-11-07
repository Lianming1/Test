package model;

import java.util.List;

public class CalcolaSconto {

	public static Offerte comparaPercentuale(List<Offerte> lista) {
		Offerte migliore= null;
		for(Offerte x: lista) {
			if(migliore==null) {
				migliore=x;
			}else if(x.getPercentuale()>migliore.getPercentuale()) {
				migliore=x;
				
			}
			
		}
		return migliore;
	}
}
