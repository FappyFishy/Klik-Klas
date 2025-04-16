package org.example;

import gebruikers.Gebruiker;

public class Reservatie {
	private Gebruiker gebruiker;
	private Ruimte ruimte;
	private int beginTijd;
	private int eindTijd;
	
	public Reservatie(Gebruiker gebruiker, Ruimte ruimte, int beginTijd, int eindTijd) {
		this.gebruiker = gebruiker;
		this.ruimte = ruimte;
		this.beginTijd = beginTijd;
		this.eindTijd = eindTijd;
	}

	public Gebruiker getGebruiker() {
		return this.gebruiker;
	}
}
