package civotIgra;

public class Igraci {
	private String ime;
	private int brojPoena;
	private String lazniOdgovor;

	public Igraci(String ime) {
		super();
		this.ime = ime;
		this.brojPoena = 0;
	}
	
	

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}
	
	
	
	public String getLazniOdgovor() {
		return lazniOdgovor;
	}



	public void setLazniOdgovor(String lazniOdgovor) {
		this.lazniOdgovor = lazniOdgovor;
	}



	public void tacanOdgovor() {
		brojPoena +=100;
	}
	
	public void igracPrevaren() {
		brojPoena +=50;
	}
	
	
	
}
