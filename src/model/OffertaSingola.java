package model;

public class OffertaSingola
{
	private String Fornitore;
	private String Prodotto;
	private float Prezzo;
	private float Magazzino;
	private float Percentuale;
	private boolean scontoQuantità;
	private boolean scontoImporto;
	private boolean scontoStagione;
	private int Quantita;
	private float Importo;
	private String Stagione;
	private int Spedizione;
	public OffertaSingola() {
		scontoQuantità=false;
		scontoImporto=false;
		scontoStagione= false;
		Quantita= 0;
		Importo= 0;
		Stagione="nessuno";
		
	}
	public String getFornitore() {
		return Fornitore;
	}
	public void setFornitore(String fornitore) {
		Fornitore = fornitore;
	}
	public String getProdotto() {
		return Prodotto;
	}
	public void setProdotto(String prodotto) {
		Prodotto = prodotto;
	}
	public float getMagazzino() {
		return Magazzino;
	}
	public void setMagazzino(float magazzino) {
		Magazzino = magazzino;
	}
	public float getPercentuale() {
		return Percentuale;
	}
	public void setPercentuale(float percentuale) {
		Percentuale = percentuale;
	}
	public boolean isScontoQuantità() {
		return scontoQuantità;
	}
	public void setScontoQuantità(boolean scontoQuantità) {
		this.scontoQuantità = scontoQuantità;
	}
	public boolean isScontoStagione() {
		return scontoStagione;
	}
	public void setScontoStagione(boolean scontoStagione) {
		this.scontoStagione = scontoStagione;
	}
	public boolean isScontoImporto() {
		return scontoImporto;
	}
	public void setScontoImporto(boolean scontoImporto) {
		this.scontoImporto = scontoImporto;
	}
	public int getQuantita() {
		return Quantita;
	}
	public void setQuantita(int quantita) {
		Quantita = quantita;
	}
	public float getImporto() {
		return Importo;
	}
	public void setImporto(float importo) {
		Importo = importo;
	}
	public String getStagione() {
		return Stagione;
	}
	public void setStagione(String stagione) {
		Stagione = stagione;
	}
	public int getSpedizione() {
		return Spedizione;
	}
	public void setSpedizione(int spedizione) {
		Spedizione = spedizione;
	}
	public float getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}
}
