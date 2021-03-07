package apstraktne_klase;

public class GlavnaApstrKlase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MojaLinkedLista lista = new MojaLinkedLista(null);
		MojaLinkedLista lista2 = new MojaLinkedLista(null);

		
		String gradovi = "Pariz London Lisabon Berlin MAdrid Amsterdam Prag Rim";
			
		String[] podaci = gradovi.split(" ");
		for (String s: podaci) {
			lista.dodajStavku(new Clan(s));
		}
		
		//lista.prodjiListu(lista.preuzmiIzvor());
		
		String brojevi = "3 7 9 1 2 4 33 5";
		
		String[] podaci2 = brojevi.split(" ");
		for (String s: podaci2) {
			lista2.dodajStavku(new Clan(s));
		}
		
		lista2.prodjiListu(lista2.preuzmiIzvor());
		
		System.out.println();
		
		lista2.izbaci(new Clan("33"));
		
		lista2.prodjiListu(lista2.preuzmiIzvor());

		
	}
	
	

}
