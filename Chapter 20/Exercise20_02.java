package chapter20;

import java.util.Collections;
import java.util.LinkedList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*20.02 (Store numbers in a linked list)
 * Write a program that lets the user enter numbers from a GUI and displays them in a text area, as shown in figure 20.17a. Use a linked list to store the numbers. Do not store duplicate numbers.
 *  Add the buttons Sort, Shuffle and reverse to sort shuffle and reverse the list
 */
public class Exercise20_02 extends Application implements EventHandler<ActionEvent>{

	private VBox parent = new VBox();
	private HBox userInputArea = new HBox();
	private HBox output = new HBox();
	private HBox buttons = new HBox();
	private LinkedList<Integer> list = new LinkedList<>();
	private Button sort = new Button("Sort");
	private Button shuffle = new Button("Shuffle");
	private Button reverse = new Button("Reverse");
	private TextField userIn = new TextField();
	private TextArea view = new TextArea();
		
		
	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Label prompt =new Label("Enter a Number: ");
		
		//add label and textfield to parent VBox and set Pos/paddings
		userInputArea.getChildren().add(prompt);
		userInputArea.getChildren().add(userIn);
		userInputArea.setAlignment(Pos.CENTER);
		userInputArea.setPadding(new Insets(10,0,10,0));
		parent.getChildren().add(userInputArea);
		
		//set textfield size and add to parent VBox
		view.prefWidthProperty().bind(parent.widthProperty());
		output.getChildren().add(view);
		parent.getChildren().add(output);
		
		
		//add some buttons
		buttons.getChildren().addAll(sort,shuffle,reverse);
		buttons.setPadding(new Insets(5,10,5,10));
		buttons.setSpacing(15);
		buttons.setAlignment(Pos.CENTER);
		parent.getChildren().add(buttons);
		
		//add some actions to buttons.
		sort.setOnAction(this);
		shuffle.setOnAction(this);
		reverse.setOnAction(this);
		
		//show scene
		Scene main = new Scene(parent, 500, 300);
		primaryStage.setScene(main);
		primaryStage.setTitle("Exercise20_02");
		primaryStage.show();
		
	}

	//event handler to handle all button clicks
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()== sort) {
			Integer input = Integer.parseInt(userIn.getText());
			if(!list.contains(input))
				list.add(input);
			
			Collections.sort(list);
			String sorted = list.toString();		//need to figure out how to remove the brackets
			view.setText(sorted);
			
		}
		if(event.getSource()== shuffle) {
			Collections.shuffle(list);
			view.setText(list.toString());
		}
		if(event.getSource()== reverse) {
			Collections.reverse(list);
			view.setText(list.toString());
		}
	}
	
}
