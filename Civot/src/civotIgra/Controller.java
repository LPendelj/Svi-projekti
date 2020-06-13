package civotIgra;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Datasource;

public class Controller implements Initializable{

	//public static List<Cinjenice> cinjenice = new LinkedList<Cinjenice>(); 
	public static List<Odgovori> listaOdgovora = new LinkedList<Odgovori>();
	public static LinkedList<Igraci> listaIgraca= new LinkedList<Igraci>();
	public static List<Igraci> tabela = new LinkedList<Igraci>();
	
	private static String imeIgraca;
	public static String getImeIgraca() {
		return imeIgraca;
	}

	@FXML
	private  ComboBox<String> combo1;
	
	
	
	@FXML
	private TextField odgovor;
	
	@FXML
	private Button dugmeOk;
	
	@FXML
	private  TextField polje;
	
	@FXML
	public Label cinjenica;
	
	@FXML
	public  Label oznakaUnos;
	
	@FXML
	public  Label oznaka;
	
	@FXML
	private Button pokreni;
	
	@FXML
	private static  int brojIgraca;


	
	@FXML
	public static   int getBrojIgraca() {
		return brojIgraca;
	}
	
	@FXML
	public  ComboBox<String> getCombo1() {
		return combo1;
	}
	
	@FXML
	public void setCombo1(ComboBox<String> combo1) {
		this.combo1 = combo1;
	}
	
	//metod za unosenje broja igraca
	@FXML
	public void onClick() {
		 brojIgraca= Integer.parseInt((String) getCombo1().getValue());
		}
	
	//pozivamo metod za menjanje scene
	
	public void promeniScenu(ActionEvent event) throws IOException {
				
		Parent root2 = FXMLLoader.load(getClass().getResource("Window2.fxml"));
		Scene secondaryStage = new Scene(root2);
		//uzimamo informacije  Stage-a
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		window.setScene(secondaryStage);
		
		window.show();
		
	}
	
	
	public void pokreniIgru(ActionEvent event) throws IOException, ClassNotFoundException {
		
		
		Parent root3 = FXMLLoader.load(getClass().getResource("WindowUnos.fxml"));
		Scene secondaryStage = new Scene(root3);
		//uzimamo informacije  Stage-a
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		window.setScene(secondaryStage);
		
		window.show();
		


	}
	
	
	public  Label getOznaka() {
		return oznaka;
	}

	public void setOznaka(Label oznaka) {
		this.oznaka=oznaka;
	}

	
	//metod za ubacivanje imena
	public void unesiIme(ActionEvent e) throws ClassNotFoundException {
		imeIgraca = polje.getText();
				
		Igraci igrac = new Igraci(imeIgraca);
		listaIgraca.add(igrac);
		polje.clear();
		int b = listaIgraca.indexOf(igrac);		
		if (b+1<brojIgraca)
		{
			oznaka.setText("Igrac broj " + (b+2) + ", upisi svoje ime:");
		}
		else {oznaka.setText("Nastavi dalje.");
		polje.setDisable(true);
	//	dugmeOk.setDisable(true);
		pokreni.setVisible(true);
		}	
	}
	
	public void pokret(MouseEvent e) {
	String a = Igra.cinjenice.get(0).getSadrzaj();
	cinjenica.setText(a);
	}
	
	public void initialize(URL url, ResourceBundle rb) {
		
	}

}
	
	

