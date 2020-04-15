package nizovi;

import java.util.Scanner;

public class Main {

	private static Spisak spisakZaLidl = new Spisak();
	private static Scanner skener = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		int izbor = 0;
		boolean izlaz = false;		
		ispisiOpcije();
		
		//ovde pravimo while petlju u kojoj se ponavlja pitanje da ukucamo broj kako bismo odabrali akciju.
		//dok god je izlaz false, petlja se ponavlja. U poslednjem izboru izbor postaje true i petljase zavrsava.
		
		while (!izlaz) {
			System.out.println("ukucaj BROJ svog izbora! Ukucaj 0 da izlistas koje su opcije.");
			izbor = skener.nextInt();
			skener.nextLine();
			
			switch(izbor) {
				case 0: 
					ispisiOpcije();
					break;
				case 1:
					spisakZaLidl.prikaziSpisak();
					break;
				case 2:
					System.out.println("izaberi namirnicu koju ces dodati na spisak!");
					String stvar = skener.nextLine();
					spisakZaLidl.dodajNaSpisak(stvar);
					break;
				case 3:
					promeniListu();
					break;
				case 4:
					izbaciSaSpiska();
					break;
				case 5:
					nadjiArtikal();
					break;
				case 6:
					izlaz = true;
					break;
			}
		
		
		}

		skener.close();
	}
	
	public static void promeniListu() {
		System.out.println("upisi broj artikla koji hoces da izmenis.");
		int brojArtikla = skener.nextInt();
		skener.nextLine();
		System.out.println("ukucaj namirnicu koju hoces da ubacis ");
		String novArtikal = skener.next();
		spisakZaLidl.promeniStvar(brojArtikla-1, novArtikal);
		
	}
	
	public static void izbaciSaSpiska() {
		System.out.println("upisi broj artikla.");
		int pozicija = skener.nextInt();
		skener.nextLine();
		
		spisakZaLidl.obrisiStvar(pozicija-1);
		}
	
	
	public static void nadjiArtikal() {
		System.out.println("upisi artikal koji trazis.");
		String artikal = skener.nextLine();
		if (spisakZaLidl.nadjiStvar(artikal) !=null) {
			System.out.println("Postoji " + artikal + " na nasoj listi.");
		} else {
			System.out.println(artikal + " nije na listi.");
		}
	}
	
	public static void ispisiOpcije() {
        System.out.println("\nPritisni ");
        System.out.println("\t 0 - da dobijes opcije.");
        System.out.println("\t 1 - da dobijes spisak namirnica");
        System.out.println("\t 2 - da dodas namirnicu na spisak.");
        System.out.println("\t 3 - da izmenis namirnicu.");
        System.out.println("\t 4 - da izbacis namirnicu sa spiska.");
        System.out.println("\t 5 - da pronadjes namirnicu u spisku.");
        System.out.println("\t 6 - da napustis aplikaciju.");
    }

}
