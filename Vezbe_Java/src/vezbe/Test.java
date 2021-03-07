package vezbe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		prosekZaZbir(11);
	
		}
	
	
	public static void prosekZaZbir(int z) {
		double brojac = 0;
		int b;
		
		for(b=1;b<1000;b++) {
				
			brojac = brojac + baciZaZbir(z);
		}
		
		System.out.println("prosecan broj bacanja je " + brojac/b);
	}
		
	public static int baciZaZbir(int z) {
		
		int i;
		
		for (i=1;i<1000;i++) {
		int kocka1=(int) (Math.random()*6+1);
		int kocka2=(int) (Math.random()*6+1);
		int zbir=kocka1+kocka2;
		if(zbir==z) {
			//System.out.println("Broj pokusaja je " + i);
			//System.out.println("uneti zbir je " + z);
			break;

		}

		}
		return i;
	
	}

	

	
	
}
