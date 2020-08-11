package civotIgra;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



	public class ControllerIgra implements Initializable {

	    @FXML
	    private Label igr;
	    
	    public void setIgrac () {
	         igr.setText(Controller.listaIgraca.get(0).getIme());
	    }
	    
	    public void setCinjenica() {
	    	cinjenica.setText(Igra.getCinjenice().get(0).getSadrzaj());
	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
		
		

		public TextField getOdgovor() {
			return odgovor;
		}

		public void setOdgovor(TextField odgovor) {
			this.odgovor = odgovor;
		}
		
		@FXML
		public Label cinjenica;
		
		@FXML
		public  Label oznakaUnos;
		
		@FXML
		private Button unos;
		
		@FXML
		private TextField odgovor;
		
		
		public void unesiPojam(ActionEvent e) {
			
			int i = 0;
			
			
			if (i<Controller.getBrojIgraca()) {
			String o = odgovor.getText();
			
			
			igr.setText(Controller.listaIgraca.get(i+1).getIme() + ",");
			
			Odgovori odgovorIgraca = new Odgovori(o);
			Controller.listaOdgovora.add(odgovorIgraca);
			Controller.listaIgraca.get(i).setLazniOdgovor(odgovorIgraca.getSadrzaj());
			i++;
			odgovor.clear();
			}
			else {
				unos.setDisable(true);
				
				
			}
			
		}
	    
	}
	
	

