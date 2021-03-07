package apstraktne_klase;

public interface ListaStavki {
	ListaClanova preuzmiIzvor();
	boolean dodajStavku(ListaClanova stavka);
	
	boolean izbaci(ListaClanova stavka);
	
	void prodjiListu(ListaClanova izvor);
	
}
