package civotIgra;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import model.Datasource;

public class Controller implements Initializable {

	//public static List<Cinjenice> cinjenice = new LinkedList<Cinjenice>(); 
	public static List<Odgovori> listaOdgovora = new LinkedList<Odgovori>();
	public static LinkedList<Igraci> listaIgraca= new LinkedList<Igraci>();
	public static List<Igraci> tabela = new LinkedList<Igraci>();
	
	private static String imeIgraca;
	public static String getImeIgraca() {
		return imeIgraca;
	}

	@FXML
	public static Label igr;
	
	@FXML
	private  ComboBox<String> combo1;
	
	@FXML
	private TextField odgovor;
	
	@FXML
	private Button dugmeOk;
	
	
	
	@FXML
	public  Label oznaka;
	
	@FXML
	private Button pokreni;
	
	@FXML
	private static  int brojIgraca;
	
	@FXML
	private  TextField polje;

	
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
	
	
	public Parent root;
	public Scene secondaryStage;
	
	public void promeniScenu(ActionEvent event) throws IOException {
				
		 root = FXMLLoader.load(getClass().getResource("Window2.fxml"));
		 secondaryStage = new Scene(root);
		//uzimamo informacije  Stage-a
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		window.setScene(secondaryStage);
		
		
		
		window.show();
		
		
			
		
		
	}
	
	
	public void pokreniIgru(ActionEvent event) throws IOException, ClassNotFoundException, InterruptedException {
		
		Stage window;
		
		window = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("WindowUnos.fxml"));
		root = loader.load();
		
		ControllerIgra cont = loader.getController();
		cont.setIgrac();
		cont.setCinjenica();
		
		window.setScene(new Scene(root));
		
		window.show();
			
		
	}
	
	public void pustiBiranje(ActionEvent event) throws IOException {
		
		Parent root4 = FXMLLoader.load(getClass().getResource("WindowIzbor.fxml"));
		Scene secondaryStage = new Scene(root4);
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
	
	
	
	
	
	
	//Label cinjenica = new Label( Igra.cinjenice.get(0).getSadrzaj());
	
	//Label igr = new Label();
	//public static void setTextToLabel () {
		//igr.setText( listaIgraca.get(0).getIme() + ",");
	//}
	

	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	



	

	
	
	//igr.setText();
	//)

}
	
	

