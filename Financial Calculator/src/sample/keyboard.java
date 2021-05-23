package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionListener;

import static javafx.application.Application.launch;

public class keyboard {
    public static TextField newTextField;  //Creating a static object for textfield

    public static Pane keyboard_open() {   //Creating a return function


        Stage stage = new Stage();


        Pane key_pane = new Pane();
        Button kbtn1 = new Button("1");
        Button kbtn2 = new Button("2");
        Button kbtn3 = new Button("3");
        Button kbtn4 = new Button("4");
        Button kbtn5 = new Button("5");
        Button kbtn6 = new Button("6");
        Button kbtn7 = new Button("7");
        Button kbtn8 = new Button("8");
        Button kbtn9 = new Button("9");
        Button kbtn10 = new Button(".");
        Button kbtn11 = new Button("0");
        Button kbtn12 = new Button("C");

        kbtn1.setLayoutX(740);
        kbtn1.setLayoutY(320);
        kbtn1.setId("key");

        kbtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "1");
            }
        });


        kbtn2.setLayoutX(820);
        kbtn2.setLayoutY(320);
        kbtn2.setId("key");
        kbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "2");
            }
        });
        kbtn3.setLayoutX(900);
        kbtn3.setLayoutY(320);
        kbtn3.setId("key");
        kbtn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "3");
            }
        });

        kbtn4.setLayoutX(740);
        kbtn4.setLayoutY(380);
        kbtn4.setId("key");
        kbtn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "4");
            }
        });

        kbtn5.setLayoutX(820);
        kbtn5.setLayoutY(380);
        kbtn5.setId("key");
        kbtn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "5");
            }
        });
        kbtn6.setLayoutX(900);
        kbtn6.setLayoutY(380);
        kbtn6.setId("key");
        kbtn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "6");
            }
        });

        kbtn7.setLayoutX(740);
        kbtn7.setLayoutY(440);
        kbtn7.setId("key");
        kbtn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "7");
            }
        });
        kbtn8.setLayoutX(820);
        kbtn8.setLayoutY(440);
        kbtn8.setId("key");
        kbtn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "8");
            }
        });
        kbtn9.setLayoutX(900);
        kbtn9.setLayoutY(440);
        kbtn9.setId("key");
        kbtn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "9");
            }
        });

        kbtn10.setLayoutX(740);
        kbtn10.setLayoutY(500);
        kbtn10.setId("key");
        kbtn10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + ".");
            }
        });
        kbtn11.setLayoutX(820);
        kbtn11.setLayoutY(500);
        kbtn11.setId("key");
        kbtn11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText(newTextField.getText() + "0");
            }
        });
        kbtn12.setLayoutX(900);
        kbtn12.setLayoutY(500);
        kbtn12.setId("key");
        kbtn12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newTextField.setText("");
            }
        });

        Button help = new Button("Help");
        help.setLayoutX(30);
        help.setLayoutY(490);
        help.setId("help");


        help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Help");
                alert.setContentText("This app is designed to calculate values related to Mortgage Calculator,Auto loan Calculator and Financial Calculator. A keyboard is created to insert values into appropriate fields.Before using the number pad press enter button to access the keyboard in each input field. The app contains 3 tabs. first tab for Mortgage Calculator second tab for Auto loan Calculator and third tab for Financial Calculator. Auto Loan contains two sub tabs to Calculate Total Price from which monthly pay, total loan amount,sales tax and upfront payment can be calculated and Monthly payment can be used to calculate vehicle price and Finance Calculator contains 5 sub tabs. Close Button is included to close the app.Calculate button is to provide the results. Results can be viewed inside a white box near the user input field.Using Mortgage Calculator  Monthly pay,total loan amount down payment  and Mortgage Payoff Date can be calculated ,Using Financial Calculator Present Value, Future Value  can be calculated. In addition to it the 5 tabs in Financial tabs are designed to calculate different parameters.Future value is calculated in FV tab,Annual Payment is calculated in PMT tab,Interest Rate is calculated in I/Y tab,N to calculate no.of period and start principal tab is used to calculate the start principal. In addition to it Present Value  can be calculated in each tab.");
                alert.show();
            }
        });


        key_pane.getChildren().addAll(kbtn1, kbtn2, kbtn3, kbtn4, kbtn5, kbtn6, kbtn7, kbtn8, kbtn9, kbtn10, kbtn11, kbtn12, help);
        return key_pane;

    }

}



