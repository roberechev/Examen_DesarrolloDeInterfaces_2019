package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author rober
 * @see ControlRocket
 * @version 1.0
 * 
 *          La aplicacion te abre un login, el boton de abajo tiene un hover
 *          para cambiar de color, y si clicas en el se abre la segunda ventana
 *          y se cierra el login.
 * 
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Mars.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			// primaryStage.setResizable(false);
			// primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
