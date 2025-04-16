package gebruikers;

import java.util.ArrayList;

import org.example.Ruimte;

public class Gebruiker {
	ArrayList<Ruimte> mijnRuimtes = new ArrayList<Ruimte>();
	protected String gebruikersNaam;
	protected String wachtwoord;
	protected String email;
	
	public String getGebruikersNaam() {
		return this.gebruikersNaam;
	}
}
