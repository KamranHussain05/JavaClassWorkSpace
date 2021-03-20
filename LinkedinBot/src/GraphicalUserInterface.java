//Author: alex wang and definitely not kamran hussain its all me trust
//Date: 12/25/2020
//rev 01
//Notes: send help - Alex

// GUI Created using JavaFX11 Library
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GraphicalUserInterface extends Application {
	private String[] nameArray = new String[2];

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// instantiate control for first name
		Label firstName = new Label("First Name: ");

		TextField fNameField = new TextField(); // text field

		// HBox layout container for first name
		HBox fnameBox = new HBox(firstName, fNameField);
		
		Label lastName = new Label("Last Name: ");

		TextField lNameField = new TextField();
		
		HBox lNameBox = new HBox(lastName, lNameField);
		
		// Creates Enter Button
		Button calculate = new Button("Enter");

		// HBox layout for Calculate Button
		HBox calcButton = new HBox(calculate);

		calculate.setAlignment(Pos.CENTER); // set alignment

		// VBox layout for all HBoxes
		VBox infoPage = new VBox(10, fnameBox, lNameBox, calcButton);

		infoPage.setAlignment(Pos.CENTER); // set alignment
		infoPage.setPadding(new Insets(10)); // set padding

		Scene scene = new Scene(infoPage); // Instantiate scene

		primaryStage.setScene(scene);

		primaryStage.show();

		// sets when button is clicked
		calculate.setOnAction((event) -> {
			System.out.println("enter button clicked");
			nameArray[0] = fNameField.getText(); // stores names in array
			nameArray[1] = lNameField.getText();
		}); // end lambda

	} // end start()
}