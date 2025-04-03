package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables
    Label label1;
    Label label2;
    Button button1;
    Button button2;
    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    // TODO: follow steps 2-9 in README.md to create a start method
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello GUI");
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();

        // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)

        AnchorPane anchorPane = new AnchorPane();
        label1 = new Label();
        label1.setText("Hello GUI World");
        anchorPane.setTopAnchor(label1,5.0);
        anchorPane.setLeftAnchor(label1, 5.0);
        anchorPane.getChildren().add(label1);

        label2 = new Label();
        label2.setText("Welcome!");
        anchorPane.setTopAnchor(label2, 5.0);
        anchorPane.setRightAnchor(label2, 5.0);
        anchorPane.getChildren().add(label2);

        button1 = new Button("Click me!");
        anchorPane.setBottomAnchor(button1, 5.0);
        anchorPane.setRightAnchor(button1, 5.0);
        anchorPane.getChildren().add(button1);

        button2 = new Button("Don't click!");
        anchorPane.setBottomAnchor(button2, 5.0);
        anchorPane.setLeftAnchor(button2, 5.0);
        anchorPane.getChildren().add(button2);

        layout.getChildren().add(anchorPane);
    }

    // TODO: follow steps 22-34 in README.md to create an event handler
    public void handle(ActionEvent actionEvent)
    {


    }
}