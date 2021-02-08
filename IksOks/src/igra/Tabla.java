package igra;

import java.util.Arrays;
import java.util.Scanner;

public class Tabla {
	
	
	private char[][] tabla;
	
	private boolean igraTraje = true;
	
	public Tabla() {
		
		tabla= new char[3][3];
		
		for (int red = 0; red<tabla.length; red++) {
				Arrays.fill(tabla[red], ' ');
			
		}
	}
	
	public void prikaziTablu() {
		for(int r=0; r<tabla.length; r++ ) {
			for(int k=0; k<tabla[0].length; k++ ) {
				System.out.print("\t" + tabla[r][k]);
				if (k==0 || k==1) {
					System.out.print("|");

				}
			}
			if(r==0||r==1) {
			System.out.print("\n------------------------------\n");
			}
		
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	} 
	
	//Ovaj metof potvrduje da li je potez dozvoljen.
	
	public boolean odigraj(char igrac, int r, int k) {
		if (r>= 0 && r <= 2 && k>= 0 && k <= 2 ) {
			if(tabla[r][k] != ' ') {
				
				System.out.println("neispravan unos.");
				return false;
			
			}
			else {
				tabla[r][k] = igrac;
				return true;
			}
		} else return false;
		
		
	} //kraj metoda
	
	
	//provera ima li mesta na tabli i da li je neko pobedio. Vraca true ako je igra gotova.
	public boolean igraAktivna() {
		return igraTraje;
	}
	
	public void pitajIgraca(char igrac) {
		Scanner sk = new Scanner(System.in);
		int r, k;
		
		
		do {
			System.out.println("Izaberi red (1-3): " + igrac);
			r = sk.nextInt();
			
			System.out.println("Izaberi kolonu (1-3): " + igrac );
			k = sk.nextInt();

			
		} while (neispravanUnos(r, k));
		
		odigraj(igrac, r-1, k-1);
	}
	
	public boolean neispravanUnos(int r, int k) {
		if (r<1||r>3) {
			return true;
		}
		if (k<1||k>3) {
			return true;
		} 
		return false;
	}
	
}
