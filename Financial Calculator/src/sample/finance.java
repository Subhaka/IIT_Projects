package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class finance {

    Tab tab;

    //make constructor of class

    public finance(Tab tab) {
        this.tab = tab;
    }

    //creating the method
    public void finance_cal() {
        TabPane financialTabPane = new TabPane();
        //creating subtab 1
        Tab sub_tab1 = new Tab("FV");

        sub_tab1.setStyle("-fx-background-color: #0080ff");
        Pane tab1_pane = new Pane();
        Label fvlbl1 = new Label("N(# of periods)");
        Label fvlbl2 = new Label("Start Principal");
        Label fvlbl3 = new Label("I/Y(Interest)");
        Label fvlbl4 = new Label("PMT(Annuity Payment)");

        TextField fvtxt1 = new TextField();
        TextField fvtxt2 = new TextField();
        TextField fvtxt3 = new TextField();
        TextField fvtxt4 = new TextField();
        Button btncal = new Button("Calculate");

        fvlbl1.setLayoutX(20);        //aligning labels and textfields
        fvlbl1.setLayoutY(20);
        fvlbl1.setId("labels");
        fvtxt1.setLayoutX(200);
        fvtxt1.setLayoutY(20);
        fvtxt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = fvtxt1;
            }
        });

        fvlbl2.setLayoutX(20);
        fvlbl2.setLayoutY(70);
        fvlbl2.setId("labels");
        fvtxt2.setLayoutX(200);
        fvtxt2.setLayoutY(70);
        fvtxt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = fvtxt2;
            }
        });

        fvlbl3.setLayoutX(20);
        fvlbl3.setLayoutY(120);
        fvlbl3.setId("labels");
        fvtxt3.setLayoutX(200);
        fvtxt3.setLayoutY(120);
        fvtxt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = fvtxt3;
            }
        });

        fvlbl4.setLayoutX(20);
        fvlbl4.setLayoutY(170);
        fvlbl4.setId("labels");
        fvtxt4.setLayoutX(200);
        fvtxt4.setLayoutY(170);
        fvtxt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = fvtxt4;
            }
        });

        btncal.setLayoutX(150);
        btncal.setLayoutY(300);
        btncal.setId("btn");

        Pane tab1_result = new Pane();
        Label aresult = new Label("Results");
        Label afv = new Label("FV(Future Value)");
        Label afvd = new Label("");
        Label apv = new Label("PV(Present Value)");
        Label apvd = new Label("");
        Label anp = new Label("N(Number Of Periods)");
        Label anpd = new Label("");
        Label aiy = new Label("I/Y(Interest Rate)");
        Label aiyd = new Label("");
        Label apmt = new Label("PMT(Periodic Payment)");
        Label apmtd = new Label("");
        Label asi = new Label("Stating Investment");
        Label asid = new Label("");
        Label tp = new Label("Total Principal");
        Label tpd = new Label();

        aresult.setLayoutX(20);
        aresult.setLayoutY(20);

        afv.setLayoutX(20);
        afv.setLayoutY(50);
        afvd.setLayoutX(200);
        afvd.setLayoutY(50);

        apv.setLayoutX(20);
        apv.setLayoutY(80);
        apvd.setLayoutX(200);
        apvd.setLayoutY(80);

        anp.setLayoutX(20);
        anp.setLayoutY(110);
        anpd.setLayoutX(200);
        anpd.setLayoutY(110);

        aiy.setLayoutX(20);
        aiy.setLayoutY(140);
        aiyd.setLayoutX(200);
        aiyd.setLayoutY(140);

        apmt.setLayoutX(20);
        apmt.setLayoutY(170);
        apmtd.setLayoutX(200);
        apmtd.setLayoutY(170);

        asi.setLayoutX(20);
        asi.setLayoutY(200);
        asid.setLayoutX(200);
        asid.setLayoutY(200);

        tp.setLayoutX(20);
        tp.setLayoutY(230);
        tpd.setLayoutX(200);
        tpd.setLayoutY(230);

        Label handle1 = new Label();
        handle1.setLayoutX(5);
        handle1.setLayoutY(290);
        handle1.setId("instruction");
        Label inst1 = new Label("Please press enter before entering value to\n access keyboard in each field");//instruction
        inst1.setLayoutX(5);
        inst1.setLayoutY(250);
        inst1.setId("instruction");

        btncal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //handling exception
                try {
                    double start_pricipal = Double.parseDouble(fvtxt2.getText());
                    asid.setText(String.format("%.2f", start_pricipal));
                    double a_payment = Double.parseDouble(fvtxt4.getText());
                    apmtd.setText(String.format("%.2f", a_payment));
                    double period = Double.parseDouble(fvtxt1.getText());
                    anpd.setText(String.format("%.2f", period));
                    double interest = Double.parseDouble(fvtxt3.getText());
                    if (interest < 100 && period < 100) {             //checking if interest rate and  no.of period values are appropriately given
                        aiyd.setText(String.format("%.2f", interest));
                        double t_principal = start_pricipal + (a_payment * period);
                        double future_value = (start_pricipal * Math.pow((1 + (interest / 100)), period)) + a_payment * (Math.pow((1 + (interest / 100)), period) - 1) / (interest / 100);
                        afvd.setText(String.format("%.2f", future_value));
                        tpd.setText(String.format("%.2f", t_principal));
                        double fpresent_value = future_value / Math.pow(1 + interest / 100, period);
                        double present_val = future_value / Math.pow(1 + interest / 100, period);
                        apvd.setText(String.format("%.2f", present_val));
                        handle1.setText("");
                    } else {
                        handle1.setText("*Please check if interest rate and no.of period value\nis between 0-100 and provide appropriate value");
                        afvd.setText("");
                        apmtd.setText("");
                        anpd.setText("");
                        tpd.setText("");
                        asid.setText("");
                        apvd.setText("");
                        aiyd.setText("");
                    }
                } catch (NumberFormatException exception) {
                    handle1.setText("*Please enter an  positive integer value to\n following fields");
                    afvd.setText("");
                    apmtd.setText("");
                    anpd.setText("");
                    tpd.setText("");
                    asid.setText("");
                    apvd.setText("");
                    aiyd.setText("");
                }
            }
        });
        //adding necessary  labels and textfields into result pane
        tab1_result.getChildren().addAll(aresult, afv, afvd, apv, apvd, anp, anpd, aiy, aiyd, apmt, apmtd, asi, asid, handle1, tp, tpd, inst1);
        tab1_result.setLayoutX(380); //setting alignment of result pane
        tab1_result.setLayoutY(20);
        tab1_result.setMinSize(300, 350);
        tab1_result.setId("result");


        financialTabPane.getTabs().addAll(sub_tab1);

        tab1_pane.getChildren().addAll(keyboard.keyboard_open(), tab1_result, fvlbl1, fvlbl2, fvlbl3, fvlbl4, fvtxt1, fvtxt2, fvtxt3, fvtxt4, btncal);
        sub_tab1.setContent(tab1_pane);

        Tab sub_tab2 = new Tab("PMT");  // Creating the second tab
        sub_tab2.setStyle("-fx-background-color: #0080ff");
        Pane tab2_pane = new Pane();
        Label pmtlbla = new Label("FV(Future Value)");
        Label pmtlblb = new Label("N(# of periods)");
        Label pmtlblc = new Label("Start Principal");
        Label pmtlbld = new Label("I/Y(Interest)");

        TextField pmttxta = new TextField();
        TextField pmttxtb = new TextField();
        TextField pmttxtc = new TextField();
        TextField pmttxtd = new TextField();

        Button btn1 = new Button("Calculate");

        pmtlbla.setLayoutX(20);
        pmtlbla.setLayoutY(20);
        pmtlbla.setId("labels");
        pmttxta.setLayoutX(200);
        pmttxta.setLayoutY(20);
        pmttxta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = pmttxta;
            }
        });

        pmtlblb.setLayoutX(20);
        pmtlblb.setLayoutY(70);
        pmtlblb.setId("labels");
        pmttxtb.setLayoutX(200);
        pmttxtb.setLayoutY(70);
        pmttxtb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = pmttxtb;
            }
        });


        pmtlblc.setLayoutX(20);
        pmtlblc.setLayoutY(120);
        pmtlblc.setId("labels");
        pmttxtc.setLayoutX(200);
        pmttxtc.setLayoutY(120);
        pmttxtc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = pmttxtc;
            }
        });

        pmtlbld.setLayoutX(20);
        pmtlbld.setLayoutY(170);
        pmtlbld.setId("labels");
        pmttxtd.setLayoutX(200);
        pmttxtd.setLayoutY(170);
        pmttxtd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = pmttxtd;
            }
        });

        btn1.setLayoutX(150);
        btn1.setLayoutY(300);
        btn1.setId("btn");

        Pane tab2_result = new Pane();
        Label bresult = new Label("Results");
        Label bfv = new Label("FV(Future Value)");
        Label bfvd = new Label("");
        Label bpv = new Label("PV(Present Value)");
        Label bpvd = new Label("");
        Label bnp = new Label("N(Number Of Periods)");
        Label bnpd = new Label("");
        Label biy = new Label("I/Y(Interest Rate)");
        Label biyd = new Label("");
        Label bpmt = new Label("PMT(Periodic Payment)");
        Label bpmtd = new Label("");
        Label bsi = new Label("Stating Investment");
        Label bsid = new Label("");

        bresult.setLayoutX(20);
        bresult.setLayoutY(20);

        bfv.setLayoutX(20);
        bfv.setLayoutY(50);
        bfvd.setLayoutX(200);
        bfvd.setLayoutY(50);

        bpv.setLayoutX(20);
        bpv.setLayoutY(80);
        bpvd.setLayoutX(200);
        bpvd.setLayoutY(80);

        bnp.setLayoutX(20);
        bnp.setLayoutY(110);
        bnpd.setLayoutX(200);
        bnpd.setLayoutY(110);

        biy.setLayoutX(20);
        biy.setLayoutY(140);
        biyd.setLayoutX(200);
        biyd.setLayoutY(140);

        bpmt.setLayoutX(20);
        bpmt.setLayoutY(170);
        bpmtd.setLayoutX(200);
        bpmtd.setLayoutY(170);

        bsi.setLayoutX(20);
        bsi.setLayoutY(200);
        bsid.setLayoutX(200);
        bsid.setLayoutY(200);
        Label inst2 = new Label("Please press enter before entering value to\n access keyboard in each field"); //instruction
        inst2.setLayoutX(5);
        inst2.setLayoutY(240);

        Label handle2 = new Label();
        handle2.setLayoutX(5);
        handle2.setLayoutY(290);
        handle2.setId("instruction");
        inst2.setId("instruction");

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //handle exception
                try {
                    double period = Double.parseDouble(pmttxtb.getText());
                    double intrest = Double.parseDouble(pmttxtd.getText());      // Converting string into double data type for calculation

                    if (intrest < 100 && period < 100) {                    //checking if interest rate and period values are given appropriately
                        bnpd.setText(String.format("%.2f", period));
                        biyd.setText(String.format("%.2f", intrest));
                        double f_value = Double.parseDouble(pmttxta.getText());
                        bfvd.setText(String.format("%.2f", f_value));
                        double starting_value = Double.parseDouble(pmttxtc.getText());
                        bsid.setText(String.format("%.2f", starting_value));
                        double PMT = (intrest / 100) * (f_value - (starting_value * Math.pow((1 + intrest / 100), period))) / (Math.pow((1 + intrest / 100), period) - 1);
                        bpmtd.setText(String.format("%.2f", PMT));
                        double present_val = f_value / Math.pow(1 + intrest / 100, period);
                        bpvd.setText(String.format("%.2f", present_val));
                        handle2.setText("");
                    } else {
                        handle2.setText("*Please check if interest rate and no.of period value\n are between 0-100 and provide appropriate value");
                        bfvd.setText("");
                        bpvd.setText("");
                        biyd.setText("");
                        bnpd.setText("");
                        bpmtd.setText("");
                        bsid.setText("");
                    }

                } catch (NumberFormatException exception) {
                    handle2.setText("*Please enter an  positive integer value to\n following fields");
                    bfvd.setText("");
                    bpvd.setText("");
                    biyd.setText("");
                    bnpd.setText("");
                    bpmtd.setText("");
                    bsid.setText("");
                }
            }
        });

        tab2_result.getChildren().addAll(bresult, bfv, bfvd, bpv, bnp, bnpd, bpvd, biy, biyd, bpmt, bpmtd, bsi, bsid, handle2, inst2);
        tab2_result.setLayoutX(380); // aligning  result pane
        tab2_result.setLayoutY(20);
        tab2_result.setMinSize(300, 350);
        tab2_result.setId("result");

        financialTabPane.getTabs().addAll(sub_tab2);
        tab2_pane.getChildren().addAll(keyboard.keyboard_open(), tab2_result, pmtlbla, pmtlblb, pmtlblc, pmtlbld, pmttxta, pmttxtb, pmttxtc, pmttxtd, btn1);
        sub_tab2.setContent(tab2_pane);

        Tab sub_tab3 = new Tab("I/Y");
        sub_tab3.setStyle("-fx-background-color: #0080ff");
        Pane tab3_pane = new Pane();

        Label iylbl1 = new Label("FV(Future Value)");
        Label iylbl2 = new Label("N(# of periods)");
        Label iylbl3 = new Label("Start Principal");
        Label iylbl4 = new Label("PMT(Annuity Payment)");

        TextField iytxt1 = new TextField();
        TextField iytxt2 = new TextField();
        TextField iytxt3 = new TextField();
        TextField iytxt4 = new TextField();

        Button iybtncal = new Button("Calculate");

        iylbl1.setLayoutX(20);
        iylbl1.setLayoutY(20);
        iylbl1.setId("labels");
        iytxt1.setLayoutX(200);
        iytxt1.setLayoutY(20);
        iytxt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = iytxt1;
            }
        });

        iylbl2.setLayoutX(20);
        iylbl2.setLayoutY(70);
        iylbl2.setId("labels");
        iytxt2.setLayoutX(200);
        iytxt2.setLayoutY(70);
        iytxt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = iytxt2;
            }
        });

        iylbl3.setLayoutX(20);
        iylbl3.setLayoutY(120);
        iylbl3.setId("labels");
        iytxt3.setLayoutX(200);
        iytxt3.setLayoutY(120);
        iytxt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = iytxt3;
            }
        });

        iylbl4.setLayoutX(20);
        iylbl4.setLayoutY(170);
        iylbl4.setId("labels");
        iytxt4.setLayoutX(200);
        iytxt4.setLayoutY(170);
        iytxt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = iytxt4;
            }
        });

        iybtncal.setLayoutX(150);
        iybtncal.setLayoutY(300);
        iybtncal.setId("btn");

        Pane tab3_result = new Pane();

        Label cresult = new Label("Results");
        Label cfv = new Label("FV(Future Value)");
        Label cfvd = new Label("");
        Label cpv = new Label("PV(Present Value)");
        Label cpvd = new Label("");
        Label cnp = new Label("N(Number Of Periods)");
        Label cnpd = new Label("");
        Label ciy = new Label("I/Y(Interest Rate)");
        Label ciyd = new Label("");
        Label cpmt = new Label("PMT(Periodic Payment)");
        Label cpmtd = new Label("");
        Label csi = new Label("Stating Investment");
        Label csid = new Label("");
        cresult.setLayoutX(20);
        cresult.setLayoutY(20);

        cfv.setLayoutX(20);
        cfv.setLayoutY(50);
        cfvd.setLayoutX(200);
        cfvd.setLayoutY(50);

        cpv.setLayoutX(20);
        cpv.setLayoutY(80);
        cpvd.setLayoutX(200);
        cpvd.setLayoutY(80);

        cnp.setLayoutX(20);
        cnp.setLayoutY(110);
        cnpd.setLayoutX(200);
        cnpd.setLayoutY(110);

        ciy.setLayoutX(20);
        ciy.setLayoutY(140);
        ciyd.setLayoutX(200);
        ciyd.setLayoutY(140);

        cpmt.setLayoutX(20);
        cpmt.setLayoutY(170);
        cpmtd.setLayoutX(200);
        cpmtd.setLayoutY(170);

        csi.setLayoutX(20);
        csi.setLayoutY(200);
        csid.setLayoutX(200);
        csid.setLayoutY(200);
        Label inst3 = new Label("Please press enter before entering value to\n access keyboard in each field"); // instruction
        inst3.setLayoutX(5);
        inst3.setLayoutY(240);
        inst3.setId("instruction");
        Label handle3 = new Label();
        handle3.setLayoutX(5);
        handle3.setLayoutY(290);
        handle3.setId("instruction");

        iybtncal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //handling exception
                try {
                    double future_value = Double.parseDouble(iytxt1.getText());
                    cfvd.setText(String.format("%.2f", future_value));
                    double period = Double.parseDouble(iytxt2.getText());
                    double start_principal = Double.parseDouble(iytxt3.getText());
                    double interest_rt = ((Math.pow((future_value / start_principal), 1 / period) - 1)) * 100;
                    if (period <= 20) {
                        cnpd.setText(String.format("%.2f", period));
                        csid.setText(String.format("%.2f", start_principal));
                        double pmt = Double.parseDouble(iytxt4.getText());
                        cpmtd.setText(String.format("%.2f", pmt));
                        ciyd.setText(String.format("%.2f", interest_rt));
                        double pre_value = future_value / Math.pow(1 + interest_rt / 100, period);
                        cpvd.setText(String.format("%.2f", pre_value));
                        handle3.setText("");
                    } else {
                        handle3.setText("*Please check if no.of period value are between\n 0-10 and provide appropriate value");
                        cfvd.setText("");
                        cpvd.setText("");
                        ciyd.setText("");
                        cnpd.setText("");
                        csid.setText("");
                    }

                } catch (NumberFormatException exception) {

                    handle3.setText("**Please enter an  positive integer value to\n following fields");
                    cfvd.setText("");
                    cpvd.setText("");
                    ciyd.setText("");
                    cnpd.setText("");
                    csid.setText("");

                }
            }
        });
        tab3_result.getChildren().addAll(cfv, cfvd, cpv, cpvd, cnp, cnpd, ciy, ciyd, cpmt, cpmtd, csi, csid, cresult, handle3, inst3);
        tab3_result.setMinSize(300, 350);
        tab3_result.setLayoutX(380);
        tab3_result.setLayoutY(20);
        tab3_result.setId("result");

        financialTabPane.getTabs().addAll(sub_tab3);
        tab3_pane.getChildren().addAll(keyboard.keyboard_open(), tab3_result, iylbl1, iylbl2, iylbl3, iylbl4, iytxt1, iytxt2, iytxt3, iytxt4, iybtncal);
        sub_tab3.setContent(tab3_pane);

        Tab sub_tab4 = new Tab("N");
        sub_tab4.setStyle("-fx-background-color: #0080ff");
        Pane tab4_pane = new Pane();

        Label nlbl1 = new Label("FV(Future Value)");
        Label nlbl2 = new Label("Start Principal");
        Label nlbl3 = new Label("I/Y(Interest)");
        Label nlbl4 = new Label("PMT(Annuity Payment)");

        TextField ntxt1 = new TextField();
        TextField ntxt2 = new TextField();
        TextField ntxt3 = new TextField();
        TextField ntxt4 = new TextField();

        Button nbtncal = new Button("Calculate");

        nlbl1.setLayoutX(20);
        nlbl1.setLayoutY(20);
        nlbl1.setId("labels");
        ntxt1.setLayoutX(200);
        ntxt1.setLayoutY(20);
        ntxt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = ntxt1;
            }
        });

        nlbl2.setLayoutX(20);
        nlbl2.setLayoutY(70);
        nlbl2.setId("labels");
        ntxt2.setLayoutX(200);
        ntxt2.setLayoutY(70);
        ntxt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = ntxt2;
            }
        });

        nlbl3.setLayoutX(20);
        nlbl3.setLayoutY(120);
        nlbl3.setId("labels");
        ntxt3.setLayoutX(200);
        ntxt3.setLayoutY(120);
        ntxt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = ntxt3;
            }
        });

        nlbl4.setLayoutX(20);
        nlbl4.setLayoutY(170);
        nlbl4.setId("labels");
        ntxt4.setLayoutX(200);
        ntxt4.setLayoutY(170);
        ntxt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = ntxt4;
            }
        });

        nbtncal.setLayoutX(150);
        nbtncal.setLayoutY(300);
        nbtncal.setId("btn");

        Pane tab4_result = new Pane();
        Label dresult = new Label("Results");
        Label dfv = new Label("FV(Future Value)");
        Label dfvd = new Label("");
        Label dpv = new Label("PV(Present Value)");
        Label dpvd = new Label("");
        Label dnp = new Label("N(Number Of Periods)");
        Label dnpd = new Label("");
        Label diy = new Label("I/Y(Interest Rate)");
        Label diyd = new Label("");
        Label dpmt = new Label("PMT(Periodic Payment");
        Label dpmtd = new Label("");
        Label dsi = new Label("Stating Investment");
        Label dsid = new Label("");

        dresult.setLayoutX(20);
        dresult.setLayoutY(20);

        dfv.setLayoutX(20);
        dfv.setLayoutY(50);
        dfvd.setLayoutX(200);
        dfvd.setLayoutY(50);

        dpv.setLayoutX(20);
        dpv.setLayoutY(80);
        dpvd.setLayoutX(200);
        dpvd.setLayoutY(80);

        dnp.setLayoutX(20);
        dnp.setLayoutY(110);
        dnpd.setLayoutX(200);
        dnpd.setLayoutY(110);

        diy.setLayoutX(20);
        diy.setLayoutY(140);
        diyd.setLayoutX(200);
        diyd.setLayoutY(140);

        dpmt.setLayoutX(20);
        dpmt.setLayoutY(170);
        dpmtd.setLayoutX(200);
        dpmtd.setLayoutY(170);

        dsi.setLayoutX(20);
        dsi.setLayoutY(200);
        dsid.setLayoutX(200);
        dsid.setLayoutY(200);
        Label inst4 = new Label("Please press enter before entering value to\n access keyboard in each field"); //instructions
        inst4.setLayoutX(5);
        inst4.setLayoutY(240);
        inst4.setId("instruction");
        Label handle4 = new Label();
        handle4.setLayoutX(5);
        handle4.setLayoutY(290);
        handle4.setId("instruction");

        nbtncal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //handle exceptions
                try {
                    double nfuture_value = Double.parseDouble(ntxt1.getText());
                    dfvd.setText(String.format("%.2f", nfuture_value));
                    double nstart_principal = Double.parseDouble(ntxt2.getText());
                    dsid.setText(String.format("%.2f", nstart_principal));         // Converting string to double data type for calculation
                    double ninterest = Double.parseDouble(ntxt3.getText());
                    if (ninterest < 100) {                                     //checking if interest rate is given with appropriate value
                        diyd.setText(String.format("%.2f", ninterest));
                        double npmt = Double.parseDouble(ntxt4.getText());
                        dpmtd.setText(String.format("%.2f", npmt));
                        double no_period = Math.log(((nfuture_value * ninterest / 100) + npmt) / ((nstart_principal * ninterest / 100) + npmt)) / Math.log(1 + ninterest / 100);
                        dnpd.setText(String.format("%.2f", no_period));
                        double present_val = nfuture_value / Math.pow(1 + ninterest / 100, no_period);
                        dpvd.setText(String.format("%.2f", present_val));
                        handle4.setText("");
                    } else {
                        handle4.setText("*Please check if interest rate value\n is between 0-100 and provide appropriate value ");
                        dfvd.setText("");
                        dpvd.setText("");
                        diyd.setText("");
                        dpmtd.setText("");
                        dsid.setText("");
                    }
                } catch (NumberFormatException exception) {
                    handle4.setText("*Please enter an  positive integer value to\n following fields");
                    dfvd.setText("");
                    dpvd.setText("");
                    diyd.setText("");
                    dpmtd.setText("");
                    dsid.setText("");
                }

            }
        });

        tab4_result.getChildren().addAll(dresult, dfv, dfvd, dpv, dpvd, dnp, dnpd, diy, diyd, dpmt, dpmtd, dsi, dsid, handle4, inst4);
        tab4_result.setMinSize(300, 350);
        tab4_result.setLayoutX(380);
        tab4_result.setLayoutY(20);
        tab4_result.setId("result");

        financialTabPane.getTabs().addAll(sub_tab4);

        tab4_pane.getChildren().addAll(keyboard.keyboard_open(), tab4_result, nlbl1, nlbl2, nlbl3, nlbl4, ntxt1, ntxt2, ntxt3, ntxt4, nbtncal);
        sub_tab4.setContent(tab4_pane);

        Tab sub_tab5 = new Tab("Start Principal");
        sub_tab5.setStyle("-fx-background-color: #0080ff");
        Pane tab5_pane = new Pane();

        Label splbl1 = new Label("FV(Future Values)");
        Label splbl2 = new Label("N(# of periods)");
        Label splbl3 = new Label("I/Y(Interest)");
        Label splbl4 = new Label("PMT(Annuity Payment)");

        TextField sptxt1 = new TextField();
        TextField sptxt2 = new TextField();
        TextField sptxt3 = new TextField();
        TextField sptxt4 = new TextField();

        Button spbtncal = new Button("Calculate");

        splbl1.setLayoutX(20);
        splbl1.setLayoutY(20);
        splbl1.setId("labels");
        sptxt1.setLayoutX(200);
        sptxt1.setLayoutY(20);
        sptxt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = sptxt1;
            }
        });

        splbl2.setLayoutX(20);
        splbl2.setLayoutY(70);
        splbl2.setId("labels");
        sptxt2.setLayoutX(200);
        sptxt2.setLayoutY(70);
        sptxt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = sptxt2;
            }
        });

        splbl3.setLayoutX(20);
        splbl3.setLayoutY(120);
        splbl3.setId("labels");
        sptxt3.setLayoutX(200);
        sptxt3.setLayoutY(120);
        sptxt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = sptxt3;
            }
        });

        splbl4.setLayoutX(20);
        splbl4.setLayoutY(170);
        splbl4.setId("labels");
        sptxt4.setLayoutX(200);
        sptxt4.setLayoutY(170);
        sptxt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                keyboard.newTextField = sptxt4;
            }
        });

        spbtncal.setLayoutX(150);
        spbtncal.setLayoutY(300);
        spbtncal.setId("btn");

        Pane tab5_result = new Pane();

        Label eresult = new Label("Results");
        Label efv = new Label("FV(Future Value)");
        Label efvd = new Label("");
        Label epv = new Label("PV(Present Value)");
        Label epvd = new Label("");
        Label enp = new Label("N(Number Of Periods)");
        Label enpd = new Label("");
        Label eiy = new Label("I/Y(Interest Rate)");
        Label eiyd = new Label("");
        Label epmt = new Label("PMT(Periodic Payment");
        Label epmtd = new Label("");
        Label esi = new Label("Stating Investment");
        Label esid = new Label("");


        eresult.setLayoutX(20);
        eresult.setLayoutY(20);
        efv.setLayoutX(20);
        efv.setLayoutY(50);
        efvd.setLayoutX(200);
        efvd.setLayoutY(50);

        epv.setLayoutX(20);
        epv.setLayoutY(80);
        epvd.setLayoutX(200);
        epvd.setLayoutY(80);

        enp.setLayoutX(20);
        enp.setLayoutY(110);
        enpd.setLayoutX(200);
        enpd.setLayoutY(110);

        eiy.setLayoutX(20);
        eiy.setLayoutY(140);
        eiyd.setLayoutX(200);
        eiyd.setLayoutY(140);

        epmt.setLayoutX(20);
        epmt.setLayoutY(170);
        epmtd.setLayoutX(200);
        epmtd.setLayoutY(170);

        esi.setLayoutX(20);
        esi.setLayoutY(200);
        esid.setLayoutX(200);
        esid.setLayoutY(200);
        Label inst5 = new Label("Please press enter before entering value to\n access keyboard in each field"); //instructions
        inst5.setLayoutX(5);
        inst5.setLayoutY(240);
        inst5.setId("instruction");

        Label handle5 = new Label();
        handle5.setLayoutX(5);
        handle5.setLayoutY(290);
        handle5.setId("instruction");
        spbtncal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //handling exceptions
                try {
                    double interest = Double.parseDouble(sptxt3.getText());
                    if (interest < 100) {                                             //checking if interest rate value is given appropriately
                        eiyd.setText(String.format("%.2f", interest));
                        double fut_value = Double.parseDouble(sptxt1.getText());
                        efvd.setText(String.format("%.2f", fut_value));             //Converting String value into double data type for calculation
                        double period = Double.parseDouble(sptxt2.getText());
                        enpd.setText(String.format("%.2f", period));
                        double pmt = Double.parseDouble(sptxt4.getText());
                        epmtd.setText(String.format("%.2f", pmt));
                        double start_principal = (fut_value / Math.pow(1 + interest / 100, period) - pmt * (Math.pow(1 + interest / 100, period) - 1) / (interest / 100 * (Math.pow(1 + interest / 100, period))));
                        esid.setText(String.format("%.2f", start_principal));
                        double pre_val = fut_value / Math.pow(1 + interest / 100, period);
                        epvd.setText(String.format("%.2f", pre_val));
                        handle5.setText("");
                    } else {
                        handle5.setText("*Please check if interest rate value is between 0-100 and provide appropriate value ");
                        efvd.setText("");
                        epvd.setText("");
                        epmt.setText("");
                        enpd.setText("");
                        esid.setText("");
                    }
                } catch (NumberFormatException exception) {
                    handle5.setText("*Please enter an  positive integer value to\n following fields");
                    efvd.setText("");
                    epvd.setText("");
                    epmt.setText("");
                    enpd.setText("");
                    esid.setText("");

                }

            }

        });
        tab5_result.getChildren().addAll(efv, efvd, epv, epvd, enp, enpd, eiy, eiyd, epmt, epmtd, esi, esid, handle5, eresult, inst5);
        tab5_result.setMinSize(300, 350);
        tab5_result.setLayoutX(380);
        tab5_result.setLayoutY(20);
        tab5_result.setId("result");


        financialTabPane.getTabs().addAll(sub_tab5);
        tab5_pane.getChildren().addAll(keyboard.keyboard_open(), tab5_result, splbl1, splbl2, splbl3, splbl4, sptxt1, sptxt2, sptxt3, sptxt4, spbtncal);
        sub_tab5.setContent(tab5_pane);

        financialTabPane.setTabMinHeight(30);
        financialTabPane.setTabMinWidth(170);
        financialTabPane.setMinSize(1000, 650);
        financialTabPane.setId("pane");

        Pane mainfinancialpane = new Pane(financialTabPane);
        tab.setContent(mainfinancialpane);
        sub_tab1.setClosable(false); //making sub tabs unclosable
        sub_tab2.setClosable(false);
        sub_tab3.setClosable(false);
        sub_tab4.setClosable(false);
        sub_tab5.setClosable(false);


    }


}
