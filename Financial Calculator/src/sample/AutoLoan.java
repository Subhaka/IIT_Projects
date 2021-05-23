package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.util.logging.Handler;

public class AutoLoan {

    Tab tab;

    //make constructor of class

    public AutoLoan(Tab tab) {
        this.tab = tab;
    }


    // creating the method

    public void autoloan_cal() {

        TabPane autoLoanTabPane = new TabPane();
        //creating subtab 1
        Tab sub_tab1 = new Tab("Total Price");              //Creating a sub tab inside auto loan tab
        sub_tab1.setStyle("-fx-background-color: #0080ff");
        Pane tp_pane = new Pane();
        // new keyboard(sub_tab1).keyboard_open();


        Label albl1 = new Label("Auto Price");
        Label albl2 = new Label("Loan Term");
        Label albl3 = new Label("Interest Rate");
        Label albl4 = new Label("Down Payment");
        Label albl5 = new Label("Trade-in Value");
        Label albl6 = new Label("Sales Tax");
        Label albl7 = new Label("Title,Registration and Other Fees");


        TextField atxt1 = new TextField();
        TextField atxt2 = new TextField();
        TextField atxt3 = new TextField();
        TextField atxt4 = new TextField();
        TextField atxt5 = new TextField();
        TextField atxt6 = new TextField();
        TextField atxt7 = new TextField();
        Button btncal = new Button("Calculate");  //Creating Button to calculate Total Price Tab values

        albl1.setLayoutX(20);     // aligning labels and text fields inside sub tab
        albl1.setLayoutY(10);
        albl1.setId("labels");
        atxt1.setLayoutX(260);
        atxt1.setLayoutY(10);

        // keyboard funtionality to each textfield in sub tab1
        atxt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxt1;
            }
        });

        albl2.setLayoutX(20);
        albl2.setLayoutY(55);
        albl2.setId("labels");
        atxt2.setLayoutX(260);
        atxt2.setLayoutY(55);
        atxt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxt2;
            }
        });

        albl3.setLayoutX(20);
        albl3.setLayoutY(100);
        albl3.setId("labels");
        atxt3.setLayoutX(260);
        atxt3.setLayoutY(100);
        atxt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxt3;
            }
        });

        albl4.setLayoutX(20);
        albl4.setLayoutY(145);
        albl4.setId("labels");
        atxt4.setLayoutX(260);
        atxt4.setLayoutY(145);
        atxt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxt4;
            }
        });

        albl5.setLayoutX(20);
        albl5.setLayoutY(190);
        albl5.setId("labels");
        atxt5.setLayoutX(260);
        atxt5.setLayoutY(190);
        atxt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxt5;
            }
        });

        albl6.setLayoutX(20);
        albl6.setLayoutY(235);
        albl6.setId("labels");
        atxt6.setLayoutX(260);
        atxt6.setLayoutY(235);
        atxt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxt6;
            }
        });

        albl7.setLayoutX(20);
        albl7.setLayoutY(280);
        albl7.setId("labels");
        atxt7.setLayoutX(260);
        atxt7.setLayoutY(280);
        atxt7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxt7;
            }
        });

        btncal.setLayoutX(200);
        btncal.setLayoutY(340);
        btncal.setId("btn");


        Pane tauto_result = new Pane();  // creating pane to display results of total price tab

        Label tlblmp = new Label("Monthly Pay:");
        Label tlblmpd = new Label("");
        Label ttlm = new Label("Total Loan Amount");
        Label ttlmd = new Label("");
        Label tst = new Label("Sale Tax");
        Label tstd = new Label("");
        Label ttlp = new Label("Upfront Payment");
        Label ttlpd = new Label("");

        tlblmp.setLayoutX(20);
        tlblmp.setLayoutY(40);
        tlblmpd.setLayoutX(220);
        tlblmpd.setLayoutY(40);


        ttlm.setLayoutX(20);
        ttlm.setLayoutY(90);
        ttlmd.setLayoutX(220);
        ttlmd.setLayoutY(90);

        tst.setLayoutX(20);
        tst.setLayoutY(140);
        tstd.setLayoutX(220);
        tstd.setLayoutY(140);

        ttlp.setLayoutX(20);
        ttlp.setLayoutY(190);
        ttlpd.setLayoutX(220);
        ttlpd.setLayoutY(190);
        Label instn = new Label("Please press enter before entering value to access keyboard in each field"); //instruction
        instn.setLayoutX(5);
        instn.setLayoutY(220);
        instn.setId("instruction");

        Label handle = new Label();
        handle.setLayoutX(5);
        handle.setLayoutY(250);
        handle.setId("instruction");
        tauto_result.setLayoutX(470);
        tauto_result.setLayoutY(20);
        tauto_result.setMinSize(450, 270);  //setting height and weight of result pane
        tauto_result.getChildren().addAll(tlblmp, tlblmpd, ttlm, ttlmd, tst, tstd, ttlp, ttlpd, handle, instn); // getting labels and textfields into result pane
        tauto_result.setId("result");

        btncal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //handling exceptions
                try {

                    double interest_rate = Double.parseDouble(atxt3.getText());
                    double s_tax = Double.parseDouble(atxt6.getText());
                    double down_payment = Double.parseDouble(atxt4.getText());
                    double trade_value = Double.parseDouble(atxt5.getText());
                    double auto_price = Double.parseDouble(atxt1.getText());
                    double loan_term = Double.parseDouble(atxt2.getText()); // Converting String values to double data type for calculations
                    double other = Double.parseDouble(atxt7.getText());
                    if (interest_rate < 100 && s_tax < 100) {              //checking if interest
                        double loan_amount = auto_price - (down_payment + trade_value);
                        ttlmd.setText(String.format("%.2f", loan_amount));
                        double tax = auto_price * (s_tax / 100) - trade_value * s_tax / 100;
                        tstd.setText(String.format("%.2f", tax));
                        double upfront_payment = down_payment + (auto_price * s_tax / 100) + other;
                        ttlpd.setText(String.format("%.2f", upfront_payment));
                        double monthly_pay = (loan_amount * (interest_rate / 100) / 12) / (1 - Math.pow(1 + ((interest_rate / 100) / 12), (-loan_term)));
                        tlblmpd.setText(String.format("%.2f", monthly_pay));
                        handle.setText("");
                    } else {
                        handle.setText("*Please check if interest rate and sales tax values are between\n 0-100 and provide appropriate value ");
                        ttlmd.setText("");
                        tstd.setText("");
                        ttlpd.setText("");
                        tlblmpd.setText("");
                    }

                } catch (NumberFormatException exception) {
                    handle.setText("*Please enter an  positive integer value to following fields");
                    ttlmd.setText("");
                    tstd.setText("");
                    ttlpd.setText("");
                    tlblmpd.setText("");

                }
            }
        });


        tp_pane.setMinSize(1000, 650);

        // calling tabs
        autoLoanTabPane.getTabs().addAll(sub_tab1);

        // calling items in sub tab1
        tp_pane.getChildren().addAll(keyboard.keyboard_open(), tauto_result, albl1, albl2, albl3, albl4, albl5, albl6, albl7, atxt1, atxt2, atxt3, atxt4, atxt5, atxt6, atxt7, btncal);
        sub_tab1.setContent(tp_pane);

        Tab sub_tab2 = new Tab("Monthly Payment");   // Creating second tab inside auto loan pane
        sub_tab2.setStyle("-fx-background-color: #0080ff");
        Pane tp1_pane = new Pane();           //Creating a pane for second tab(Monthly Payment)

        Label albla = new Label("Monthly Pay");
        Label alblb = new Label("Loan Term");
        Label alblc = new Label("Interest Rate");
        Label albld = new Label("Down Payment");
        Label alble = new Label("Trade-in Value");
        Label alblf = new Label("Sales Tax");
        Label alblg = new Label("Title,Registration and Other Fees");

        TextField atxta = new TextField();
        TextField atxtb = new TextField();
        TextField atxtc = new TextField();
        TextField atxtd = new TextField();
        TextField atxte = new TextField();
        TextField atxtf = new TextField();
        TextField atxtg = new TextField();

        Button mpbtn = new Button("Calculate");

        albla.setLayoutX(20);
        albla.setLayoutY(10);
        albla.setId("labels");
        atxta.setLayoutX(260);
        atxta.setLayoutY(10);
        atxta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxta;
            }
        });

        alblb.setLayoutX(20);
        alblb.setLayoutY(55);
        alblb.setId("labels");
        atxtb.setLayoutX(260);
        atxtb.setLayoutY(55);
        atxtb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxtb;
            }
        });

        alblc.setLayoutX(20);
        alblc.setLayoutY(100);
        alblc.setId("labels");
        atxtc.setLayoutX(260);
        atxtc.setLayoutY(100);
        atxtc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxtc;
            }
        });

        albld.setLayoutX(20);
        albld.setLayoutY(145);
        albld.setId("labels");
        atxtd.setLayoutX(260);
        atxtd.setLayoutY(145);
        atxtd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxtd;
            }
        });

        alble.setLayoutX(20);
        alble.setLayoutY(190);
        alble.setId("labels");
        atxte.setLayoutX(260);
        atxte.setLayoutY(190);
        atxte.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxte;
            }
        });

        alblf.setLayoutX(20);
        alblf.setLayoutY(235);
        alblf.setId("labels");
        atxtf.setLayoutX(260);
        atxtf.setLayoutY(235);
        atxtf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxtf;
            }
        });

        alblg.setLayoutX(20);
        alblg.setLayoutY(280);
        alblg.setId("labels");
        atxtg.setLayoutX(260);
        atxtg.setLayoutY(280);
        atxtg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = atxtg;
            }
        });

        mpbtn.setLayoutX(200);
        mpbtn.setLayoutY(340);
        mpbtn.setId("btn");

        Pane tab2_result = new Pane();
        Label mvp = new Label("Vehicle Price:");
        Label mvpd = new Label("");


        mvp.setLayoutX(20);
        mvp.setLayoutY(40);
        mvpd.setLayoutX(220);
        mvpd.setLayoutY(40);


        Label inst2 = new Label("Please press enter before entering value to access keyboard in each field"); //instruction
        inst2.setLayoutX(5);
        inst2.setLayoutY(100);
        inst2.setId("instruction");

        Label handle1 = new Label();
        handle1.setLayoutX(5);
        handle1.setLayoutY(150);
        handle1.setId("instruction");

        mpbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    double monthly_pay = Double.parseDouble(atxta.getText());
                    double interest_rate = Double.parseDouble(atxtc.getText());
                    double loan_term = Double.parseDouble(atxtb.getText());
                    double sale_tax = Double.parseDouble(atxtf.getText());
                    double down_payment = Double.parseDouble(atxtd.getText()); // converting String value into double data type for calculation
                    double trade = Double.parseDouble(atxte.getText());
                    if (interest_rate < 100 && sale_tax < 100) {
                        double factor = (monthly_pay * (1 - Math.pow(1 + ((interest_rate / 12) / 100), (-loan_term))) / ((((interest_rate / 12) / 100))));
                        double vehicle_price = factor + down_payment + trade;
                        mvpd.setText(String.format("%.2f", vehicle_price));
                        handle1.setText("");
                    } else {
                        handle1.setText("*Please check if interest rate and sales values are between\n 0-100 and provide appropriate value ");
                    }
                } catch (NumberFormatException exception) {
                    handle1.setText("*Please enter an  positive integer value to following fields");
                    mvpd.setText("");
                }
            }
        });

        tab2_result.getChildren().addAll(mvp, mvpd, handle1, inst2);
        tab2_result.setMinSize(450, 180); // setting height and width of result pane
        tab2_result.setLayoutX(470);  //setting alignment of result pane
        tab2_result.setLayoutY(20);
        tab2_result.setId("result");

        //  adding neccessary labels,texfield,buttons and result pane into mortgage pane
        autoLoanTabPane.getTabs().addAll(sub_tab2);
        tp1_pane.getChildren().addAll(keyboard.keyboard_open(), tab2_result, albla, alblb, alblc, albld, alble, alblf, alblg, atxta, atxtb, atxtc, atxtd, atxte, atxtf, atxtg, mpbtn);
        sub_tab2.setContent(tp1_pane);

        autoLoanTabPane.setTabMinHeight(30); // Setting width and height of tabs
        autoLoanTabPane.setTabMinWidth(400);
        autoLoanTabPane.setMinSize(1000, 650); //setting width and height of auto loan tabpane
        autoLoanTabPane.setId("auto"); //adding style for auto loan tab pane

        Pane mainAutoLoanPane = new Pane(autoLoanTabPane);
        tab.setContent(mainAutoLoanPane);

        // setclose false
        sub_tab1.setClosable(false); // making tabs unclosble
        sub_tab2.setClosable(false);
    }
}
