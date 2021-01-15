package plejlistaPackage;

public class Pesma {
	private String naziv;
	private double duzina;
	
	
	
	
	public Pesma(String naziv, double duzina) {
		super();
		this.naziv = naziv;
		this.duzina = duzina;
	}


	public String getNaziv() {
		return naziv;
	}
	
	@Override
	public String toString() {
		return this.naziv + ": " + this.duzina;
	}
	
	
}
