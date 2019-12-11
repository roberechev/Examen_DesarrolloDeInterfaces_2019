package view;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {
	@FXML
	private JFXButton cambio;

	@FXML
	private Pane p1;

	@FXML
	private ImageView im;

	public void initialize() {
		FadeTransition fade = new FadeTransition(Duration.seconds(2), im);
		fade.setFromValue(0);
		fade.setToValue(1);

		fade.play();

	}

	@FXML
	private void cambio() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
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

	@FXML
	private void close() {
		System.exit(0);
	}

}
