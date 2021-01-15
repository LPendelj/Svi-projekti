package plejlistaPackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String ime;
	private String izvodjac;
	private ArrayList<Pesma> pesme;
	
	public Album(String ime, String izvodjac, ArrayList<Pesma> pesme) {
		super();
		this.ime = ime;
		this.izvodjac = izvodjac;
		this.pesme = new ArrayList<Pesma>();
	}
	
	public boolean dodajPesmu(String naziv, double duzina) {
		if (nadjiPesmu(naziv)==null) {
			this.pesme.add(new Pesma(naziv, duzina));
			return true;
		}
		return false;
	}
	
	private Pesma nadjiPesmu(String naziv) {
		for(Pesma provera:this.pesme) {
			if (provera.getNaziv().equals(naziv)) {
				return provera;
			}
		}
		return null;
	}
	public boolean dodajPesmu(int brojPesme, LinkedList<Pesma> plejlista) {
		int index = brojPesme - 1;
		if ((index >= 0) && (index < this.pesme.size())){
			plejlista.add(this.pesme.get(index));
			return true;
		}
		System.out.println("album nema pesmu broj " + brojPesme);
		return false;
	}
	
	public boolean dodajPesmu(String nazivPesme, LinkedList<Pesma> plejlista) {
		Pesma provera = nadjiPesmu(nazivPesme);
		if(provera != null) {
			plejlista.add(provera);
			return true;
		}
		System.out.println("Pesma nije u albumu.");
		return false;
	}
	
}
