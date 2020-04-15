package nizovi;
import java.util.ArrayList;

public class Spisak {
	private ArrayList<String> spisak = new ArrayList<String>();
	
	public void dodajNaSpisak(String stvar) {
	//uzima rec koju upisemo i dodaje je po redu na spisak.
		
		spisak.add(stvar);
			}
	
	public void prikaziSpisak() {
		System.out.println("na listi ima " + spisak.size() + " stvari");
		//prikazuje sta imamo na spisku tako sto vrti od 0 do kraja liste
		for(int i=0; i<spisak.size(); i++) {
			System.out.println((i+1) + ": " + spisak.get(i));
		}
	}
	
	public void promeniStvar(int pozicija, String stvar) {
		//menja spisak tako da uzimajuci rec i mesto ubacuje datu stvar na upisano mesto na listi
		spisak.set(pozicija, stvar);
		System.out.println("stvar na poziciji " + (pozicija+1) + " je promenjena" );
	
	}

	public void obrisiStvar(int pozicija) {
		//brise stavku sa spiska
		String stvar = spisak.get(pozicija);
		spisak.remove(pozicija);
		}
	
	public String nadjiStvar(String stvar) {
		//boolean postoji = spisak.contains(stvar);
		int pozicija = spisak.indexOf(stvar);
		
		
		if (pozicija>=0) {return spisak.get(pozicija);}
		else return null;
		
	}
	
		
	}

