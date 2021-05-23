package sample;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class Controller {
    private Tab tab;
    private Object TabPane;
    private javafx.scene.control.TabPane tabPane;





    public void finance(Tab tab){this.tab=tab;}

    public void setTab1(Tab tab1) {
        TabPane = tabPane = new TabPane();
        Tab tb1 = new Tab("FV");
        tabPane.getTabs().add(tb1);
        Tab tab2 = new Tab("PMT");
        tabPane.getTabs().add(tab2);
        Tab tab3 = new Tab("I/Y");
        tabPane.getTabs().add(tab3);
        Tab tab4 = new Tab("N");
        tabPane.getTabs().add(tab4);
        Tab tab5 = new Tab("Start Principle");
        tabPane.getTabs().add(tab5);


        AnchorPane Main = new AnchorPane();
        Main.getChildren().addAll(tabPane);

    }}
