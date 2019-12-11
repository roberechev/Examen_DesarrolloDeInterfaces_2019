package view;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControlRocket {
	@FXML
	private JFXButton cambio;
	
	@FXML
	private Pane p1;

	@FXML
	private void cambio() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 570, 320);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			// primaryStage.initStyle(StageStyle.UNDECORATED);
			Stage cerrar = (Stage) p1.getScene().getWindow();
			cerrar.close();
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
