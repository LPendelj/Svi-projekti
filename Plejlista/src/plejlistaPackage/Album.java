package plejlistaPackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String ime;
	private String izvodjac;
	private ListaPesama pesme;
	//private ArrayList<Pesma> pesme;
	
	public Album(String ime, String izvodjac) {
		super();
		this.ime = ime;
		this.izvodjac = izvodjac;
		//this.pesme = new ArrayList<Pesma>();
		this.pesme = new ListaPesama();
	}
	
	private class ListaPesama{
		private ArrayList<Pesma> pesme;
		
		public ListaPesama() {
			this.pesme = new ArrayList<Pesma>();
		}
		
		public boolean dodajPesmu(Pesma pesma) {
			if(pesme.contains(pesma)) {
				return false;
			}
			this.pesme.add(pesma);
			return true;
		}
		
		private Pesma nadjiPesmu(String naziv) {
			for(Pesma provera:this.pesme) {
				if (provera.getNaziv().equals(naziv)) {
					return provera;
				}
			}
			return null;
		}
		
		public Pesma nadjiPesmu(int broj) {
			int i = broj-1;
			if((broj>0) && (broj<pesme.size())) {
				return pesme.get(i);
			}
			return null;
		}
		
	}
	
	public boolean dodajPesmu(String naziv, double duzina) {
		return this.pesme.dodajPesmu(new Pesma(naziv, duzina));
		
		
		
	}
	
	
	public boolean dodajPesmu(int brojPesme, LinkedList<Pesma> plejlista) {
		Pesma proverena = this.pesme.nadjiPesmu(brojPesme);
			if(proverena != null) {
				plejlista.add(proverena);
				return true;
			}
		
		System.out.println("album nema pesmu broj " + brojPesme);
		return false;
	}
	
	public boolean dodajPesmu(String nazivPesme, LinkedList<Pesma> plejlista) {
		Pesma provera = pesme.nadjiPesmu(nazivPesme);
		if(provera != null) {
			plejlista.add(provera);
			return true;
		}
		System.out.println("Pesma nije u albumu.");
		return false;
	}
	
}
