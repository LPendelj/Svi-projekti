package igra;

public class Igra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tabla igra = new Tabla();
		int brojac = 1;
		
		while (igra.igraAktivna()) {
			if (brojac % 2 == 1) {
				igra.pitajIgraca('0');
			}
			else {igra.pitajIgraca('X');}
			brojac++;
			
			System.out.println('\n');
			igra.prikaziTablu();
		}
		
		
		
		igra.odigraj('O', 0, 1);
		
		igra.prikaziTablu();
		
		igra.odigraj('O', 0, 1);


	}

}
