package org.example;

import java.util.ArrayList;
import java.util.Timer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import gebruikers.Gebruiker;

@Entity
@Table(name = "ruimte", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Ruimte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "naam", unique = true, nullable = false, length = 100)
	private String naam;
	
	@Column(name = "capaciteit", unique = false, nullable = false, length = 100)
	private Integer capaciteit;
	
	@Column(name = "faciliteit", unique = false, nullable = false, length = 100)
	private String faciliteit;
	
	ArrayList<Reservatie> bezettingen = new ArrayList<Reservatie>();
	
	public Ruimte() {
		
	}
	
	public Ruimte(String naam, int capaciteit, String faciliteit) {
		this.naam = naam;
		this.capaciteit = capaciteit;
		this.faciliteit = faciliteit;
	}
	
	public void maakReservatie(Gebruiker gebruiker, int beginTijd, int eindTijd) {
		Reservatie nieuw = new Reservatie(gebruiker, this, beginTijd, eindTijd);
		this.bezettingen.add(nieuw);
	}
	
	public void deleteReservatie(Reservatie reservatie, Gebruiker gebruiker) {
		if (reservatie.getGebruiker() == gebruiker) {
			this.bezettingen.remove(reservatie);
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
}
