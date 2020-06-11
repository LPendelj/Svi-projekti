package civotIgra;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controller {
	@FXML
	private  ComboBox combo1;
	
	@FXML
	private Button dugmeOk;
	
	@FXML
	private  TextField polje;
	
	@FXML
	public  Label oznaka;
	
	
	private static String imeIgraca;
	public static String getImeIgraca() {
		return imeIgraca;
	}

	@FXML
	private static  int brojIgraca;

	@FXML
	public static   int getBrojIgraca() {
		return brojIgraca;
	}
	
	@FXML
	public  ComboBox getCombo1() {
		return combo1;
	}
	
	@FXML
	public void setCombo1(ComboBox combo1) {
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
	
	
	public  Label getOznaka() {
		return oznaka;
	}

	public void setOznaka(Label oznaka) {
		this.oznaka=oznaka;
	}

	//metod za ubacivanje imena
	public void unesiIme(ActionEvent e) {
		imeIgraca = polje.getText();
		polje.clear();
	}
	
	//metod u kome sadrzaj oznake dobija redni broj igraca koji je na redu

	public void promeniOznaku() {
		for (int i=0; i<getBrojIgraca(); i++) {
			oznaka.setText("Igrac broj " + i + ", upisi svoje ime:");
		}

	}
	
//public void initialize(URL url, RescourceBundle rb) {
//	
//}

	
	
	
}
