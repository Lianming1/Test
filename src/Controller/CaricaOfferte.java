package Controller;

import model.CaricaInDB;
import model.OffertaSingola;

public class CaricaOfferte {

	
	
	public CaricaOfferte(OffertaSingola nuova) {
		
		CaricaInDB.carica(nuova);
		
		
		
	}
	
	

}
