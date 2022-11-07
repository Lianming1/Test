package model;

public class Proposta 
{
	private String nomeFornitore;
	private float Prezzo;
	private int GiorniSpedizione;
	public Proposta(String nome,float totale, int Giorni) {
		setGiorniSpedizione(Giorni);
		setNomeFornitore(nome);
		setPrezzo(totale);
		
	}
	public String getNomeFornitore() {
		return nomeFornitore;
	}
	public void setNomeFornitore(String nomeFornitore) {
		this.nomeFornitore = nomeFornitore;
	}
	public float getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}
	public int getGiorniSpedizione() {
		return GiorniSpedizione;
	}
	public void setGiorniSpedizione(int giorniSpedizione) {
		GiorniSpedizione = giorniSpedizione;
	}

}
