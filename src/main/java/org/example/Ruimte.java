package org.example;

public class Ruimte {
	private int id;
	private static int nextId = 1;
	private String naam;
	private int capaciteit;
	private String faciliteit;
	
	public Ruimte() {
		this.id = this.nextId;
		this.nextId += 1;
	}
}
