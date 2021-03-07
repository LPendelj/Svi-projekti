package setovi_mar21;
import java.util.HashSet;
import java.util.Set;

public final class NebeskoTelo {
	private final String ime;
	private final double obrtnoVreme;
	private final Set <NebeskoTelo> sateliti;
	
	public NebeskoTelo (String ime, double obrtnoVreme){
		this.ime = ime;
		this.obrtnoVreme = obrtnoVreme;
		this.sateliti= new HashSet<>();
		}
	
	public String getIme() {
		return ime;
	}
	
	public double getObrtnoVreme() {
		return obrtnoVreme;
	}
	
	
	//dodajemo satelit koji prati planetu u skup
	public boolean dodajSatelit(NebeskoTelo satelit) {
		return this.sateliti.add(satelit);
	}

	
	
	//metod koji vraca novi hash skup koji se sastoji od skupa satelita ove klase
	  public Set<NebeskoTelo> getSateliti(){
		  return new HashSet<>(this.sateliti); 
		  }
	 
	
	
}
