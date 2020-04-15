package kompozicija;

public class Zidovi {
	private double visina;
	private double sirina;
	private String boja;
	
	public Zidovi(double visina, double sirina, String boja) {
		
		this.visina = visina;
		this.sirina = sirina;
		this.boja = boja;
	}
	
	public void obojiZid(String boja) {
		this.boja = boja;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}

	public double getSirina() {
		return sirina;
	}

	public void setSirina(double sirina) {
		this.sirina = sirina;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	
	
}
