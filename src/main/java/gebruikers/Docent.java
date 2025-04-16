package gebruikers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "docent", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Docent extends Gebruiker {
protected static int nextId = 1;
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "gebruikersNaam", unique = false, nullable = false, length = 100)
	private String gebruikersNaam;
	
	@Column(name = "wachtwoord", unique = false, nullable = false, length = 100)
	private String wachtwoord;
	
	@Column(name = "email", unique = true, nullable = false, length = 100)
	private String email;
	
	public Docent(String gebruikersNaam, String wachtwoord, String email) {
		this.id = this.nextId;
		this.nextId += 1;
		this.gebruikersNaam = gebruikersNaam;
		this.wachtwoord = wachtwoord;
		this.email = email;
	}
}
