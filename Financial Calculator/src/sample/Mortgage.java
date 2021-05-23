package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.ComboBox;

import javax.swing.text.StyledEditorKit;

import java.awt.*;

import static javax.swing.text.StyledEditorKit.*;

public class Mortgage {

    Tab tab;

    //make constructor of class

    public Mortgage(Tab tab) {
        this.tab = tab;
    }


    // creating  the method

    public void mortgage_cal() {
        Label mlbl1 = new Label("Home Price");
        Label mlbl2 = new Label("Down Payment");
        Label mlbl3 = new Label("Loan Term");
        Label mlbl4 = new Label("Interest Rate");
        Label mlbl5 = new Label("Start Date");

        TextField mtxt1 = new TextField();
        TextField mtxt2 = new TextField();
        TextField mtxt3 = new TextField();
        TextField mtxt4 = new TextField();
        TextField year = new TextField();

        Button btn = new Button("Calculate");

        //setting  alignments
        mlbl1.setLayoutX(20);  // setId is used to get particular style from style sheet and assigning to places where the particular style need to be applied
        mlbl1.setLayoutY(20);
        mlbl1.setId("labels");
        mtxt1.setLayoutX(150);
        mtxt1.setLayoutY(20);
        mtxt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = mtxt1;
            }                                                          // keyboard button functionality to each textfield
        });

        mlbl2.setLayoutX(20);
        mlbl2.setLayoutY(70);
        mlbl2.setId("labels");
        mtxt2.setLayoutX(150);
        mtxt2.setLayoutY(70);
        mtxt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = mtxt2;
            }
        });

        mlbl3.setLayoutX(20);
        mlbl3.setLayoutY(120);
        mlbl3.setId("labels");
        mtxt3.setLayoutX(150);
        mtxt3.setLayoutY(120);
        mtxt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = mtxt3;
            }
        });

        mlbl4.setLayoutX(20);
        mlbl4.setLayoutY(170);
        mlbl4.setId("labels");
        mtxt4.setLayoutX(150);
        mtxt4.setLayoutY(170);
        mtxt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = mtxt4;
            }
        });

        year.setLayoutX(240);
        year.setLayoutY(235);
        year.setMaxWidth(65);
        year.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = year;
            }
        });

        btn.setLayoutX(100);
        btn.setLayoutY(350);
        btn.setId("btn");
        mlbl5.setLayoutX(20);
        mlbl5.setLayoutY(240);
        mlbl5.setId("labels");

        Pane result = new Pane();               // creating a pane to display results
        Label mp = new Label("Monthly Pay");
        Label mpd = new Label("");
        Label hp = new Label("Home Price");
        Label hpd = new Label("");
        Label la = new Label("Loan Amount");
        Label lad = new Label("");
        Label dp = new Label("Down Payment");
        Label dpd = new Label("");
        Label mod = new Label("Mortgage Payoff Date");
        Label modd = new Label("");


        mp.setLayoutX(20);
        mp.setLayoutY(20);
        mpd.setLayoutX(280);
        mpd.setLayoutY(20);

        hp.setLayoutX(20);
        hp.setLayoutY(50);
        hpd.setLayoutX(280);
        hpd.setLayoutY(50);

        la.setLayoutX(20);
        la.setLayoutY(80);
        lad.setLayoutX(280);
        lad.setLayoutY(80);

        dp.setLayoutX(20);
        dp.setLayoutY(110);
        dpd.setLayoutX(280);
        dpd.setLayoutY(110);

        mod.setLayoutX(20);
        mod.setLayoutY(140);
        modd.setLayoutX(280);
        modd.setLayoutY(140);
        result.setId("result");
        Label handle = new Label();
        handle.setLayoutX(5);
        handle.setLayoutY(240);
        handle.setId("instruction");
        Label inst = new Label("Please press enter before entering value to access keyboard in each field");// instruction label
        inst.setLayoutX(5); //setting alignment of instruction label
        inst.setLayoutY(200);
        inst.setId("instruction");
        result.getChildren().addAll(mp, hp, hpd, la, lad, dp, dpd, mod, modd, mpd, handle, inst); //adding labels created for display result into pane result
        result.setLayoutX(400);
        result.setLayoutY(5);   // aligning result pane inside mortgage pane
        result.setMinSize(500, 270);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //  handling exception for empty string and string input
                try {


                    double home_price = Double.parseDouble(mtxt1.getText()); // to get  value entered for home price
                    double dwn_payment = Double.parseDouble(mtxt2.getText()); // to get value  entered for down payment
                    double interest = Double.parseDouble(mtxt4.getText()); // to get value entered for interest rate in percentage

                    //checking if user inputs a percentage between 0-100 for down payment and interest
                    if (dwn_payment < 100 && interest < 100) {  //checking if user inputs a percentage between 0-100 for down payment and interest rate
                        hpd.setText(String.format("%.2f", home_price)); // setting outputs to display in label
                        double s_year = Double.parseDouble(year.getText());
                        double loan_amount = home_price - home_price * dwn_payment / 100; //loan amount equation
                        lad.setText(String.format("%.2f", loan_amount));
                        double down_payment = home_price * (dwn_payment / 100);
                        dpd.setText(String.format("%.2f", down_payment));
                        double loan_term = Double.parseDouble(mtxt3.getText());
                        double start_date = Double.parseDouble(year.getText());
                        modd.setText(String.valueOf(start_date + loan_term));
                        double interest_rate = interest / 100;
                        double monthly_payment = (loan_amount * (interest / 100 / 12)) / (1 - Math.pow(1 + (interest / 100 / 12), (-12 * loan_term)));
                        mpd.setText(String.format("%.2f", monthly_payment));
                        handle.setText("");
                        //string inputs need to be converted to double or float datatype value for calculations

                    } else {
                        handle.setText("*Please check if interest rate and down payment values are between\n 0-100 and provide appropriate value ");
                        hpd.setText("");
                        lad.setText("");
                        dpd.setText("");
                        modd.setText("");
                        mpd.setText("");
                    }

                } catch (NumberFormatException exception) {
                    handle.setText("*Please enter an  positive integer value to following fields");
                    hpd.setText("");
                    lad.setText("");
                    dpd.setText("");
                    modd.setText("");
                    mpd.setText("");
                }
            }
        });

        Pane mortgage_pane = new Pane();
        mortgage_pane.setMinSize(1000, 650); //setting height and width of mortgage pane
        mortgage_pane.setId("mortgage"); //style id given for mortgage pane

        // adding neccessary labels,texfield,buttons and result pane into mortgage pane
        mortgage_pane.getChildren().addAll(keyboard.keyboard_open(), result, mlbl1, mlbl2, mlbl3, mlbl4, mlbl5, mtxt1, mtxt2, mtxt3, mtxt4, year, btn);
        tab.setContent(mortgage_pane);

    }
}
