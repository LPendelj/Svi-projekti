package apstraktne_klase;

public abstract class ListaClanova {
	protected ListaClanova desnaVeza = null;
	protected ListaClanova levaVeza = null;
	
	protected Object vrednost;
	
	
	public ListaClanova(Object vrednost) {
		this.vrednost =  vrednost;
	}
	
	//sledeci clan liste
	abstract ListaClanova sledeci();
	//sacuvaj sledeci clan
	abstract ListaClanova sacuvajSledeci(ListaClanova stavka);
	
	abstract ListaClanova prosli();
	abstract ListaClanova sacuvajProsli(ListaClanova stavka);
	
	
	//metod kojim uporedjujemo dva clana
	abstract int compareTo(ListaClanova stavka);
	
	//geteri i seteri
	public Object getVrednost() {
		return vrednost;
	}

	public void setVrednost(Object vrednost) {
		this.vrednost =  vrednost;
	}
	
	
	
	
}
