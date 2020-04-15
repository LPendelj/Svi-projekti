package kompozicija;

public class Main {

	public static void main(String[] args) {
		Stolica tabure = new Stolica("tabure", "zelena");
		Krevet krevet = new Krevet("bracni", 6);
		Zidovi zid1 = new Zidovi(2.5, 6, "zut");
		Zidovi zid2 = new Zidovi(2.5, 8, "zut");
		
		Soba spavacaSoba = new Soba(zid1, zid2, krevet, tabure);
		System.out.println(spavacaSoba);
		
		zid1.obojiZid("plav");
		zid2.obojiZid("beo");
	
		System.out.println(spavacaSoba);
	}

}
