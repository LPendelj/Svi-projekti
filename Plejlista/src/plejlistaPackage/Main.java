package plejlistaPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albumi = new ArrayList<Album>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Album album = new Album("Pozitivna geografija", "Bajaga i Instruktori");
		album.dodajPesmu("Verujem, ne verujem", 3.4);
		album.dodajPesmu("Berlin", 4.14);
		album.dodajPesmu("tamara", 2.6);
		album.dodajPesmu("Muzika na struju", 3.8);
		album.dodajPesmu("Limene trube", 3.9);
		album.dodajPesmu("Papaline", 5.1);
		
		albumi.add(album);
		
		album = new Album("Najveci hitovi", "Prljavo kazaliste");
		album.dodajPesmu("Zaustavite zemlju", 2.4);
		album.dodajPesmu("Marina", 3.43);
		album.dodajPesmu("Crno bijeli svet", 2.9);
		album.dodajPesmu("Sve je lako kad si mlad", 3.94);

		
		albumi.add(album);
		
		LinkedList<Pesma> plejlista = new LinkedList<Pesma>();
		albumi.get(0).dodajPesmu("Berlin", plejlista);
		albumi.get(0).dodajPesmu("tamara", plejlista);
		//albumi.get(0).dodajPesmu("Pepea prase", plejlista);
		albumi.get(0).dodajPesmu(4, plejlista);
		albumi.get(1).dodajPesmu("Marina", plejlista);
		albumi.get(1).dodajPesmu(3, plejlista);
		
		pusti(plejlista);
		pusti(plejlista);

	}
	
	private static void pusti(LinkedList<Pesma> plejlista) {
		Scanner sk = new Scanner(System.in);
		boolean i = false;
		boolean n = true;
		
		ListIterator<Pesma> listiterator = plejlista.listIterator();
		if(plejlista.size()==0) {
			System.out.println("Plejlista prazna");
		} else {
			System.out.println("Slusa se " + listiterator.next().toString());
			ispisiOpcije();
		}
		
		while(!i) {
			int akcija = sk.nextInt();
			sk.nextLine();
			
			switch(akcija) {
			case 0:
				System.out.println("Plejlista gotova");
				break;
			case 1:
				if(!n) {
					if(listiterator.hasNext()) {
						listiterator.next();
					}
					n=true;
				}
				if(listiterator.hasNext()) {
					System.out.println("Pusta se " + listiterator.next().toString());
				} else {
					System.out.println("Kraj liste");
					n= false;
				}
				break;
			case 2:
				if(n) {
					if(listiterator.hasPrevious()) {
						listiterator.previous();
					}
					n = false;
				}
				if(listiterator.hasPrevious()) {
					System.out.println("Pusta se " + listiterator.previous().toString());
				} else {
					System.out.println("Lista je ponovo na pocetku");
					n= true;
				}
				break;
			case 3: 
				if(n) {
					if(listiterator.hasPrevious()) {
						System.out.println("Pusta se " + listiterator.previous().toString());
						n=false;
					} else System.out.println("Na pocetku smo liste");
				}
				else {
					if(listiterator.hasNext()) {
						System.out.println("Pusta se " + listiterator.next().toString());
					 n=true;
					} else {
						System.out.println("Na karju liste smo.");
					}
				}
				break;
			case 4:
				ispisiListu(plejlista);
				break;
			case 5:
				ispisiOpcije();
				break;
			case 6:
				if(plejlista.size()>0) {
					listiterator.remove();
					if(listiterator.hasNext()) {
						System.out.println("Pusta se " + listiterator.next());
					} else if(listiterator.hasPrevious()) {
						System.out.println("Pusta se " + listiterator.previous());
					}
			}
				break;
			}
		}
	
		sk.close();
	}
	private static void ispisiOpcije() {
		System.out.println("Dostupne mogucnosti:\npritisni:");
		System.out.println("0 - za izlaz\n" + 
							"1 - da pustis sledecu pesmu\n" +
							"2 - da pustis prethodnu pesmu\n" +
							"3 - da ponovis pesmu\n"  +
							"4 - da prikazes pesme\n" +
							"5 - ispisi opcije\n" +
							"6 - obrisi pesmu sa liste\n");
	}
	
	private static void ispisiListu(LinkedList<Pesma> plejlista) {
		Iterator<Pesma> iterator = plejlista.iterator();
		System.out.println("---------------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		System.out.println("---------------------");

	}
	
	
	
}
