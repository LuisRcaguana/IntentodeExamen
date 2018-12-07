package application;

import java.io.IOException;
import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ControlFX {
	@FXML
	private AnchorPane ventanaPrincipal, panelMenu;
	
	@FXML
	private JFXButton botonAceptar;
	
	@FXML
	private ImageView imagen;
	
	public void initialize() {
		fadeIn();
	}
	
	
	
	public void sendStage() {
		
	}
	
	
	public void closeStage() {
		Stage st = (Stage) ventanaPrincipal.getScene().getWindow();
		st.close();
	}
	
	
	public void hover() {
		botonAceptar.setStyle("-fx-background-color: black");
	}
	
	
	public void unHover() {
		botonAceptar.setStyle("-fx-background-color: orange");
	}
	
	
	public void fadeIn() {
		FadeTransition fade = new FadeTransition(Duration.seconds(5), imagen);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}
}
