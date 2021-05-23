package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import static javafx.scene.text.Font.font;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        //adding main_pane
        TabPane main_pane = new TabPane();

        //adding tabs inside main_pane

        Tab tab1 = new Tab("Mortgage Loan");
        tab1.setStyle("-fx-background-color: #3333ff");
        Tab tab2 = new Tab("Auto loan");
        tab2.setStyle("-fx-background-color: #3333ff");
        Tab tab3 = new Tab("Financal Loan");
        tab3.setStyle("-fx-background-color: #3333ff");

        // making tabs unclosable
        tab1.setClosable(false);
        tab2.setClosable(false);
        tab3.setClosable(false);

        main_pane.setMinSize(1000, 650); // setting height and width of main_pane
        main_pane.setTabMinHeight(40); //setiing width and height of tabs
        main_pane.setTabMinWidth(250);

        main_pane.getTabs().addAll(tab1, tab2, tab3);

        main_pane.prefWidthProperty().bind(primaryStage.widthProperty());

        //calling tab1,tab2 and tab3 inside
        new Mortgage(tab1).mortgage_cal();
        new AutoLoan(tab2).autoloan_cal();
        new finance(tab3).finance_cal();

        AnchorPane main = new AnchorPane();
        Button close = new Button("Close"); // Creating a button inside main anchor pane so it can be accessed by other classes as well
        close.setLayoutX(30);
        close.setLayoutY(470);  //alignment of buttons
        close.setId("close");

        main.getChildren().addAll(main_pane, close); //adding main_pane(TabPane)and close button inside the AnchorPane
        main_pane.setId("tp_pane");

        Scene scene = new Scene(main, 1000, 650);//setting the height and width of anchorpane
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());// connecting external stylesheet with main
        primaryStage.setTitle("Financial Calculator");
        primaryStage.setScene(scene);
        primaryStage.setMaxWidth(1000);
        primaryStage.show();
        // giving action to close button
        close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                primaryStage.close();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}


