package gebruikers;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "student", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Student extends Gebruiker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "gebruikersNaam", unique = false, nullable = false, length = 100)
	private String gebruikersNaam;
	
	@Column(name = "wachtwoord", unique = false, nullable = false, length = 100)
	private String wachtwoord;
	
	@Column(name = "email", unique = true, nullable = false, length = 100)
	private String email;
	
	/**
	 * Default Constructor
	 */
	
	public Student() {
		
	}
	
	public Student(String gebruikersNaam, String wachtwoord, String email) {
		this.gebruikersNaam = gebruikersNaam;
		this.wachtwoord = wachtwoord;
		this.email = email;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGebruikersNaam() {
		return gebruikersNaam;
	}

	public void setGebruikersNaam(String gebruikersNaam) {
		this.gebruikersNaam = gebruikersNaam;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(getId(), other.getId());
	}

	@Override
	public String toString() {
		return getGebruikersNaam();
	}
}
