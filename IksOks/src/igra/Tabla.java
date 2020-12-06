package igra;

import java.util.Arrays;

public class Tabla {
	
	
	private char[][] tabla;
	
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
	}
	
}
