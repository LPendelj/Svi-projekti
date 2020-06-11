package civotIgra;



import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import model.Datasource;


public class Igra extends Application{
	
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
		
		primaryStage.setTitle("Baronija kviz");
		primaryStage.setScene(new Scene(root, 800,600));
		primaryStage.show();
	}
	
	/*public void changeScene(Stage primaryStage) throws Exception {
		Parent root2 = FXMLLoader.load(getClass().getResource("Window2.fxml"));
		
		
		primaryStage.setScene(new Scene(root2, 800,600));
		primaryStage.show();
	}*/
	
	//public static List<Cinjenice> cinjenice = new LinkedList<Cinjenice>();
	public static List<Odgovori> listaOdgovora = new LinkedList<Odgovori>();
	public static List<Igraci> listaIgraca = new LinkedList<Igraci>();
	public static List<Igraci> tabela = new LinkedList<Igraci>();
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		launch(args);
		Datasource datasource = new Datasource();
		datasource.open();
		
		List<Cinjenice> cinjenice= datasource.preuzmi();
		
		datasource.close();
		
		
		Scanner sc = new Scanner(System.in);
		
// Ovde je isao stari kod
		
		Collections.shuffle(cinjenice);
		
		
// System.out.println("BARONIJA KVIZ\n");
		
		System.out.println("Izaberi do 5 igraca!");

		int brojIgraca= Controller.getBrojIgraca();
	
		
		//secondaryStage.setTitle("Baronija kviz");
		//secondaryStage.setScene(new Scene(root2, 800,600));
		//secondaryStage.show();
		
		
		
		//int brojIgraca=sc.nextInt();
		if (brojIgraca>5) {
			brojIgraca=5;
		}  else if (brojIgraca<1) {
			brojIgraca=1;
		}
		
		
		
		System.out.println();
		System.out.println("Izabrano je " + brojIgraca + " igraca.");
		System.out.println();
		
		for (int i = 1; i<=brojIgraca; i++) {
			
			
			System.out.println("Igrac broj " + i + ":\nUpisi svoje ime");
			
			
			String imeIgraca = Controller.getImeIgraca();
			
			System.out.println();
			
			Igraci igrac = new Igraci(imeIgraca);
			
			listaIgraca.add(igrac);
		}
		System.out.println("Igra pocinje\n");
		
		
		
		boolean izlaz=false;
		int j = 0;
	
		while (!izlaz) {
			
		
			
		for (int i = 0; i<brojIgraca; i++) {
			System.out.println("Na redu je " + listaIgraca.get(i).getIme());
			System.out.println("Nakon sto dobijes tvrdnju, upisi odgovor koji mislis da je tacan u prazno polje.");		
			System.out.println(cinjenice.get(j).getSadrzaj());
			Odgovori odgovorIgraca = new Odgovori(sc.next());
			listaOdgovora.add(odgovorIgraca);
			listaIgraca.get(i).setLazniOdgovor(odgovorIgraca.getSadrzaj());
		}
		
		listaOdgovora.add(cinjenice.get(j).getOdgovor());
		
		Collections.shuffle(listaOdgovora);
		
		
		System.out.println("\n\nPonudjeni odgovori su:");
		for(Odgovori o : listaOdgovora) {
			System.out.println(o.getSadrzaj());
		}
		
		for (int i = 0; i<brojIgraca; i++) {
		System.out.println("\n" + listaIgraca.get(i).getIme() + ", izaberi tacan odgovor.");
		String pokusajOdgovora = sc.next();
		if (pokusajOdgovora.equals(cinjenice.get(j).getOdgovor().getSadrzaj())) {
				listaIgraca.get(i).tacanOdgovor();
			};
		for(Igraci ig : listaIgraca) {
			if (ig.getLazniOdgovor().equals(pokusajOdgovora)){
				ig.igracPrevaren();
			}
		}
			
		}
		
			listaOdgovora.clear();
			
			System.out.println("\nDa li hocete jos da igrate? (upisi da ili ne)");
			String izbor = sc.next();
			if(izbor.endsWith("da") && j<cinjenice.size()-1) {
				izlaz = false;
				j++;
				}
				else {
					izlaz=true;
				}
			System.out.println();
			}
		
		
		System.out.println("Igra je gotova.\n");
		System.out.println("Tabela:");
		for (Igraci ig: listaIgraca) {
			System.out.println(ig.getIme() + ": " + ig.getBrojPoena());
		}
		
		

		sc.close();
		
			
		/*while(!izlaz) {
			System.out.println("ukucaj BROJ svog izbora! Ukucaj 0 da izlistas koje su opcije.");
			izbor = sc.nextInt();
			sc.nextLine();
			
			switch(izbor) {
				case 0: 
					ispisiOpcije();
					break;
				case 1:
					spisakZaLidl.prikaziSpisak();
					break;
				case 2:
					System.out.println("izaberi namirnicu koju ces dodati na spisak!");
					String stvar = skener.nextLine();
					spisakZaLidl.dodajNaSpisak(stvar);
					break;
				case 3:
					promeniListu();
					break;
				case 4:
					izbaciSaSpiska();
					break;
				case 5:
					nadjiArtikal();
					break;
				case 6:
					izlaz = true;
					break;
			}*/
			
		
		
		
		
		
		}
		
		
	
	public static void ispisiOpcije() {
        System.out.println("\nPritisni ");
        System.out.println("\t 0 - da dobijes opcije.");
        System.out.println("\t 1 - da dobijes spisak namirnica");
        System.out.println("\t 2 - da dodas namirnicu na spisak.");
        System.out.println("\t 3 - da izmenis namirnicu.");
        System.out.println("\t 4 - da izbacis namirnicu sa spiska.");
        System.out.println("\t 5 - da pronadjes namirnicu u spisku.");
        System.out.println("\t 6 - da napustis aplikaciju.");
    }

}
