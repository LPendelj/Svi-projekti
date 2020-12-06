package igra;

import java.util.HashMap;
import java.util.Map;

public class Lokacije {
	private final int idLokacije;
	private final String opis;
	private final Map<String, Integer> izlaz;
	
	public Lokacije(int idLokacije, String opis) {
		this.idLokacije = idLokacije;
		this.opis = opis;
		this.izlaz = new HashMap<String, Integer>();
		this.izlaz.put("Q", 0);
	}

	
	public void dodajIzlaz(String pravac, int lokacija) {
		izlaz.put(pravac, lokacija);
	}
	
	public int getIdLokacije() {
		return idLokacije;
	}

	public String getOpis() {
		return opis;
	}

	public Map<String, Integer> getIzlaz() {
		return new HashMap<String, Integer>(izlaz);
	}
	
	
	
}
