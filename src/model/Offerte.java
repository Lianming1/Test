package model;

public class Offerte {
	
	
	private float Percentuale;
	private int GiorniSpedizione;
	public Offerte(float percentuale,int GiorniSpedizione) {
		setPercentuale(percentuale);
		setGiorniSpedizione(GiorniSpedizione);
	}
	public float getPercentuale() {
		return Percentuale;
	}
	public void setPercentuale(float percentuale) {
		Percentuale = percentuale;
	}
	public int getGiorniSpedizione() {
		return GiorniSpedizione;
	}
	public void setGiorniSpedizione(int giorniSpedizione) {
		GiorniSpedizione = giorniSpedizione;
	}
	
	

}
