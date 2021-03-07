package setovi_mar21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainSateliti {

	private static Map<String, NebeskoTelo> suncevSistem = new HashMap<>();
	private static Set<NebeskoTelo> planete = new HashSet<>();
	
	public static void main(String[] args) {

		//napravili smo nebesko telo - merkur
		NebeskoTelo temp = new NebeskoTelo("merkur", 88);
		//dodali smo ga u mapu suncev sistem pomocu put metoda
		suncevSistem.put(temp.getIme(), temp);
		//dodali smo ga u skup planeta pomocu add metoda
		planete.add(temp);
		
		 temp = new NebeskoTelo("zemlja", 365);
		suncevSistem.put(temp.getIme(), temp);
		planete.add(temp);
		
		
		//dodajemo mesec zemlji
		NebeskoTelo tempMesec = new NebeskoTelo("mesec", 27);
		suncevSistem.put(tempMesec.getIme(), tempMesec);
		temp.dodajSatelit(tempMesec);
		
		 
		temp = new NebeskoTelo("venera", 225);
		suncevSistem.put(temp.getIme(), temp);
		planete.add(temp);
		
		System.out.println("Planete:");
		for(NebeskoTelo planeta : planete) {
			System.out.println(planeta.getIme());
		}
		
		System.out.println();

		
		NebeskoTelo telo = suncevSistem.get("zemlja");
		
		System.out.println("Sateliti tela koje se zove " + telo.getIme());
		for(NebeskoTelo sateliti : telo.getSateliti()) {
			System.out.println(sateliti.getIme());
		}
		
		Set<NebeskoTelo> meseci = new HashSet<>();
		for(NebeskoTelo planeta: planete) {
			meseci.addAll(planeta.getSateliti());
		}
		
		System.out.println();
		
		System.out.println("Sateliti:");
		for(NebeskoTelo mesec : meseci) {
			System.out.println(mesec.getIme());
		}
		
		
			
		
	}

}
