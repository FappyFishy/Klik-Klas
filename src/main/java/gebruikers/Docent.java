package gebruikers;

public class Docent extends Gebruiker {
	public Docent() {
		this.id = this.nextId;
		this.nextId += 1;
	}
}
