package kompozicija;

public class Soba {
	private Zidovi zid1;
	private Zidovi zid2;
	private Krevet krevet;
	private Stolica stolica;

	public Soba(Zidovi zid1, Zidovi zid2, Krevet krevet, Stolica stolica) {
		this.zid1 = zid1;
		this.zid2 = zid2;
		this.krevet = krevet;
		this.stolica = stolica;
			
	}


	public String toString() {
		return "Soba [zid1 je " + zid1.getBoja() + ", zid2 je " + zid2.getBoja() + ", krevet je " + krevet.getModel() + ", stolica je " + stolica.getModel() + "]";
	}
	
	
	
	
	
}
