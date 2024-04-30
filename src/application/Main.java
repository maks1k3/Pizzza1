package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;



public class Main extends Application  {
	@Override
	public void start (Stage primaryStage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/main_scene.fxml"));
		Scene scene = new Scene(fxmlLoader.load());
//		ToggleGroup pizzaGroup = (ToggleGroup) scene.lookup("#$pizza");
		
//		 pizzaGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
//	            if (newValue != null) {
//	                System.out.println("Selected RadioButton: " + newValue.getUserData());
//	            }
//	        });

	      
	
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
