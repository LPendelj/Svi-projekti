package civotIgra;

public class Cinjenice {
	private int id;
	private String sadrzaj;
	private Odgovori odgovor;
	private String kategorija;
	private Tezina tezina;
	
	
	public Cinjenice() {
		
	}
	public Cinjenice(String sadrzaj, Odgovori odgovor) {
	
		this.sadrzaj = sadrzaj;
		this.odgovor = odgovor;
		this.kategorija = "opsta";
	}
	
	public Cinjenice(int id, String sadrzaj, Odgovori odgovor) {
		
		this.sadrzaj = sadrzaj;
		this.odgovor = odgovor;
		this.kategorija = "opsta";
	}
	
	public Cinjenice(String sadrzaj, Odgovori odgovor, String kategorija) {
		this.sadrzaj = sadrzaj;
		this.odgovor = odgovor;
		this.kategorija = kategorija;
	}
	
	private enum Tezina{LAKA, SREDNJA, TESKA};
	
	
		
	

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	public Odgovori getOdgovor() {
		return odgovor;
	}

	public void setOdgovor(Odgovori odgovor) {
		this.odgovor = odgovor;
	}

	public String getKategorija() {
		return kategorija;
	}

	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}

	public Tezina getTezina() {
		return tezina;
	}

	public void setTezina(Tezina tezina) {
		this.tezina = tezina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
