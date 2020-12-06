package igra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Map<Integer, Lokacije> lokacije = new HashMap<Integer, Lokacije>();

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sk = new Scanner(System.in);
		
		lokacije.put(0, new Lokacije(0, "PRed kompjuterom si"));
		lokacije.put(1, new Lokacije(1, "Na kraju puta pored kucice si"));
		lokacije.put(2, new Lokacije(2, "Na vrhu si brda"));
		lokacije.put(3, new Lokacije(3, "Pored izvora si"));
		lokacije.put(4, new Lokacije(4, "Pored potoka si"));
		lokacije.put(5, new Lokacije(5, "U sumi si"));
		
		lokacije.get(1).dodajIzlaz("S", 5);
		lokacije.get(1).dodajIzlaz("J", 4);
		lokacije.get(1).dodajIzlaz("I", 3);
		lokacije.get(1).dodajIzlaz("Z", 2);
		
		lokacije.get(2).dodajIzlaz("S", 5);

		
		
		lokacije.get(3).dodajIzlaz("Z", 1);

		
		lokacije.get(4).dodajIzlaz("S", 1);
		lokacije.get(4).dodajIzlaz("Z", 2);

		
		lokacije.get(5).dodajIzlaz("J", 1);
		lokacije.get(5).dodajIzlaz("Z", 2);

		Map<String, String> recnik = new HashMap<String, String>();
		recnik.put("IZLAZ", "Q");
		recnik.put("SEVER", "S");
		recnik.put("JUG", "J");
		recnik.put("ZAPAD", "Z");
		recnik.put("ISTOK", "I");
		
		
		
		
		int lok = 1;
			while(true) {
				System.out.println(lokacije.get(lok).getOpis());
				if(lok==0) {
					break;
				}
				
				Map<String, Integer> izlazi = lokacije.get(lok).getIzlaz();
				System.out.println("Dostupni izlazi su:");
				
				for(String izlaz:izlazi.keySet()) {
					System.out.print(izlaz + ", ");
				}
				System.out.println();
				
				
				String dir = sk.nextLine().toUpperCase();
				
				if (dir.length()>1) {
					String[] reci = dir.split(" ");
					for (String rec: reci) {
						if(recnik.containsKey(rec)) {
							dir = recnik.get(rec);
							break;
						}
					}
				}
				
				if (izlazi.containsKey(dir)){
					lok = izlazi.get(dir);
				} else {
					System.out.println("Ne mozes ici tamo.");
				}
				
				
			}
			sk.close();
	
	}

}
