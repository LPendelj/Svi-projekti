package kompozicija;

public class Krevet {
	private String model;
	private int velicina;
	
	public Krevet(String model, int velicina) {
		
		this.model = model;
		this.velicina = velicina;
	}
	
	private void ubaciKrevet() {
		System.out.println("Krevet je ubacen");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
}
