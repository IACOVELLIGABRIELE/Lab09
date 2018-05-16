package it.polito.tdp.borders.model;

public class Country {
	
	private String stato;
	private int confini;
	private int codice;
	private String abbreviazione;
	
	public Country(String stato, int confini) {

		this.stato = stato;
		this.confini = confini;
	}
	
	public Country(String stato, int codice, String abbreviazione) {
	
		this.stato = stato;
		this.codice = codice;
		this.abbreviazione = abbreviazione;
	}
	
	public Country(String stato, int confini, int codice, String abbreviazione) {

		this.stato = stato;
		this.confini = confini;
		this.codice = codice;
		this.abbreviazione = abbreviazione;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public int getConfini() {
		return confini;
	}

	public void setConfini(int confini) {
		this.confini = confini;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getAbbreviazione() {
		return abbreviazione;
	}

	public void setAbbreviazione(String abbreviazione) {
		this.abbreviazione = abbreviazione;
	}

	@Override
	public String toString() {
		return stato + " , numero stati confinanti = " + confini;
	}
	
	
	
	
	

}
