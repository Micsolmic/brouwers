package be.vdab.entities;

import be.vdab.valueobjects.Adres;

public class Brouwer {
	
	private String naam;
	private Integer omzet;
	private long brouwerNr;
	private Adres adres;
	
	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public long getBrouwerNr() {
		return brouwerNr;
	}

	public void setBrouwerNr(long brouwerNr) {
		this.brouwerNr = brouwerNr;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Integer getOmzet() {
		return omzet;
	}

	public void setOmzet(Integer omzet) {
		this.omzet = omzet;
	}

	
	
	public Brouwer(Long nr, String naam, Integer omzet, Adres adres) {
		this.brouwerNr = nr;
		this.naam = naam;
		this.omzet = omzet;
		this.adres = adres;
	}
}
