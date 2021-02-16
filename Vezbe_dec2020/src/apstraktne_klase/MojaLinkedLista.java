package apstraktne_klase;

public class MojaLinkedLista implements ListaStavki {
	
	private ListaClanova izvor = null;
	
	 public MojaLinkedLista(ListaClanova izvor) {
		// TODO Auto-generated constructor stub
		this.izvor = izvor;
	}
	
	@Override
	public ListaClanova preuzmiIzvor() {
		// TODO Auto-generated method stub
		return this.izvor;
	}

	@Override
	public boolean dodajStavku(ListaClanova novaStavka) {
		// TODO Auto-generated method stub
		if(this.izvor == null) {
			this.izvor = novaStavka;
			return true;
		}
		ListaClanova trenutnaStavka = this.izvor;
		while(trenutnaStavka != null) {
			int poredjenje = (trenutnaStavka.compareTo(novaStavka));
			if (poredjenje<0) {
				//novaStavka je veca, pomera se posle (desno)
				if(trenutnaStavka.sledeci() != null) {
					trenutnaStavka = trenutnaStavka.sledeci();
				} else {
					trenutnaStavka.sacuvajSledeci(novaStavka);
					novaStavka.sacuvajProsli(trenutnaStavka);
					return true;
				}
			} else if(poredjenje > 0) {
				//nova stavka manja - ubacuje se pre (levo)
				if(trenutnaStavka.prosli() != null) {
					trenutnaStavka.prosli().sacuvajSledeci(novaStavka);
					novaStavka.sacuvajProsli(trenutnaStavka.prosli());
					novaStavka.sacuvajSledeci(trenutnaStavka);
					trenutnaStavka.sacuvajProsli(novaStavka);
				} else {
					novaStavka.sacuvajSledeci(this.izvor);
					this.izvor.sacuvajProsli(novaStavka);
					this.izvor = novaStavka;
				}
				return true;
			} else {
				System.out.println(novaStavka.getVrednost() + " je vec u listi.");
				return false;
			}
		}
		
		return false;
	}

	@Override
	public boolean izbaci(ListaClanova stavka) {
		// TODO Auto-generated method stub
		if(stavka!=null) {
			System.out.println("Brise se " + stavka.getVrednost());
		}
		ListaClanova trenutnaStavka = this.izvor;
		while(trenutnaStavka!=null) {
			int poredjenje = trenutnaStavka.compareTo(stavka);
			if(poredjenje==0) {
				if(trenutnaStavka == this.izvor) {
					this.izvor = trenutnaStavka.sledeci();
				} else {
					trenutnaStavka.prosli().sacuvajSledeci(trenutnaStavka.sledeci());
					if(trenutnaStavka.sledeci()!= null) {
						trenutnaStavka.sledeci().sacuvajProsli(trenutnaStavka.prosli());
					}
				}
				return true;
			} else if (poredjenje<0) {
				trenutnaStavka = trenutnaStavka.sledeci();
			} else {
				return false;
			}
		}
		
		return false;
	}

	@Override
	public void prodjiListu(ListaClanova izvor) {
		// TODO Auto-generated method stub
		if (izvor==null) {
			System.out.println("lista je prazna");
		} else {		
		while(izvor!= null) {
			System.out.println(izvor.getVrednost());
			izvor = izvor.sledeci();
		
		}
	}
	}
}
	
	

