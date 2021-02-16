package apstraktne_klase;

public class Clan extends ListaClanova {
	
	public Clan(Object vrednost) {
		super(vrednost);
	}
	
	//objekat vraca sledeceg clana liste
	@Override
	ListaClanova sledeci() {
		// TODO Auto-generated method stub
		return this.desnaVeza;
	}

	@Override
	ListaClanova sacuvajSledeci(ListaClanova stavka) {
		// TODO Auto-generated method stub
		this.desnaVeza = stavka;
		return this.desnaVeza;
	}

	@Override
	ListaClanova prosli() {
		// TODO Auto-generated method stub
		return this.levaVeza;
	}

	@Override
	ListaClanova sacuvajProsli(ListaClanova stavka) {
		// TODO Auto-generated method stub
		this.levaVeza=stavka;
		return levaVeza;
	}

	@Override
	int compareTo(ListaClanova stavka) {
		// TODO Auto-generated method stub
		if(stavka != null) {
			return ((String) super.getVrednost()).compareTo((String) stavka.getVrednost());
		}
		else {
			return -1;
		}
		
		
	}
	
}
