import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
/**
 *
 * @author PC
 */
public class LayoutFX9 extends Application {

   


    @Override
    public void start(Stage primaryStage) {
        Button closeButton = new Button("button");
        CheckBox checkbox = new CheckBox("checkbox");
        Hyperlink hyperlink = new Hyperlink("hyperlink");
        ToggleButton togglebutton = new ToggleButton("togglebutton");
        RadioButton radiobutton = new RadioButton("radiobutton");
        Label label = new Label("Label");
        TextField textField = new TextField();

        // In real life, use an external style sheet rather than inline styles: 
        // I did it this way for brevity 
       // closeButton.setStyle("-fx-font-size: 6pt; -fx-text-fill:red;");

        Label label1 = new Label("button:");
        Label label2 = new Label("checkbox:");
        Label label3 = new Label("hiperlink:");
        Label label4 = new Label("togglebutton:");
        Label label5 = new Label("radiobutton:");
        Label label6 = new Label("label:");
        Label label7 = new Label("textfield:");
	// este es mi aporte 
	//Andres es puto




        

        
        VBox vbox = new VBox(label1, label2, label3, label4, label5, label6, label7);
        vbox.setSpacing (20);
        

        
        label1.setGraphic(closeButton);
        label1.setContentDisplay(ContentDisplay.RIGHT);
     
        label2.setGraphic(checkbox);
        label2.setContentDisplay(ContentDisplay.RIGHT);
        
        label3.setGraphic(hyperlink);
        label3.setContentDisplay(ContentDisplay.RIGHT);
        
        label4.setGraphic(togglebutton);
        label4.setContentDisplay(ContentDisplay.RIGHT);
        
        label5.setGraphic(radiobutton);
        label5.setContentDisplay(ContentDisplay.RIGHT);
        
        label6.setGraphic(label);
        label6.setContentDisplay(ContentDisplay.RIGHT);
        
        label7.setGraphic(textField);
        label7.setContentDisplay(ContentDisplay.RIGHT);
        
        
        
      //  flowpane.setOrientation(Orientation.VERTICAL);
        
        //flowpane.setHgap(10);
       // flowpane.setVgap(10);
       
        //label2.setContentDisplay(ContentDisplay.RIGHT);

        //HBox root = new HBox(label, label2);
        
                //label2.setContentDisplay(ContentDisplay.RIGHT);
                
                //HBox root = new HBox(label, label2);
;
        
        
       // Label label2 = new Label("checkbox");
       // label.setGraphic(closeButton);
       // label.setContentDisplay(ContentDisplay.RIGHT);
        
       //HBox root = new HBox(label, label2);
        
        //closeButton.setOnAction(event -> root.getChildren().remove(label));

        Scene scene = new Scene(vbox, 250, 150);    
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}