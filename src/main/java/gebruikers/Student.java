package gebruikers;

public class Student extends Gebruiker {
	public Student() {
		this.id = this.nextId;
		this.nextId += 1;
	}
}
