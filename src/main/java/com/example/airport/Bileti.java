package com.example.airport;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class Bileti {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button b;

    @FXML
    private CheckBox bag;

    @FXML
    private DatePicker dat;

    @FXML
    private Button e;

    @FXML
    private TextField fam;

    @FXML
    private Button n;

    @FXML
    private TextField name;

    @FXML
    private TextField otch;

    @FXML
    private TextField pasp;

    @FXML
    private TextField pochta;

    @FXML
    private Button pop;

    @FXML
    private ChoiceBox<?> tarif;

    @FXML
    void bagag(ActionEvent event) {

    }

    @FXML
    void buy(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Крч эта вся говешка в бета-версии потом увидите туда сюда готовый результатик <3");
    }

    @FXML
    void datae(ActionEvent event) {

    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void nazad(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("bileti.fxml"));
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 404);
        Stage stage1 = new Stage();
        stage1.setTitle("Авторизация");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void popular(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("bileti.fxml"));
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("popular.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage1 = new Stage();
        stage1.setTitle("Популярные туры");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void initialize() {
        assert b != null : "fx:id=\"b\" was not injected: check your FXML file 'bileti.fxml'.";
        assert bag != null : "fx:id=\"bag\" was not injected: check your FXML file 'bileti.fxml'.";
        assert dat != null : "fx:id=\"dat\" was not injected: check your FXML file 'bileti.fxml'.";
        assert e != null : "fx:id=\"e\" was not injected: check your FXML file 'bileti.fxml'.";
        assert fam != null : "fx:id=\"fam\" was not injected: check your FXML file 'bileti.fxml'.";
        assert n != null : "fx:id=\"n\" was not injected: check your FXML file 'bileti.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'bileti.fxml'.";
        assert otch != null : "fx:id=\"otch\" was not injected: check your FXML file 'bileti.fxml'.";
        assert pasp != null : "fx:id=\"pasp\" was not injected: check your FXML file 'bileti.fxml'.";
        assert pochta != null : "fx:id=\"pochta\" was not injected: check your FXML file 'bileti.fxml'.";
        assert pop != null : "fx:id=\"pop\" was not injected: check your FXML file 'bileti.fxml'.";
        assert tarif != null : "fx:id=\"tarif\" was not injected: check your FXML file 'bileti.fxml'.";

    }

}
