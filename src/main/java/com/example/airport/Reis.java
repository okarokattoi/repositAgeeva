package com.example.airport;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;

import static com.example.airport.connect.getsetReisi;

public class Reis {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<getsetReis, Date> datea;

    @FXML
    private TableColumn<getsetReis, Integer> id;

    @FXML
    private TableColumn<getsetReis, String> kyda;

    @FXML
    private Button n;

    @FXML
    private TableColumn<getsetReis, String> otkyda;

    @FXML
    private TableColumn<getsetReis, String> samolet;

    @FXML
    private TableView<getsetReis> table;

    @FXML
    private TableColumn<getsetReis, String> timee;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void nazad(ActionEvent event) throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("reis.fxml"));
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 389, 207);
        Stage stage1 = new Stage();
        stage1.setTitle("Меню");
        stage1.setScene(scene1);
        stage1.show();

    }

    ObservableList<getsetReis> listBAPA;

    //Обновление данных в таблице
    @FXML
    void obnovit() {
        id.setCellValueFactory(new PropertyValueFactory<getsetReis,Integer>("id"));
        samolet.setCellValueFactory(new PropertyValueFactory<getsetReis, String>("samolet"));
        otkyda.setCellValueFactory(new PropertyValueFactory<getsetReis, String>("otkyda"));
        kyda.setCellValueFactory(new PropertyValueFactory<getsetReis, String>("kyda"));
        datea.setCellValueFactory(new PropertyValueFactory<getsetReis, Date>("data"));
        timee.setCellValueFactory(new PropertyValueFactory<getsetReis, String>("time"));

        listBAPA = getsetReisi();
        table.setItems(listBAPA);
    }

    @FXML
    void initialize() {
        assert datea != null : "fx:id=\"datea\" was not injected: check your FXML file 'reis.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'reis.fxml'.";
        assert kyda != null : "fx:id=\"kyda\" was not injected: check your FXML file 'reis.fxml'.";
        assert n != null : "fx:id=\"n\" was not injected: check your FXML file 'reis.fxml'.";
        assert otkyda != null : "fx:id=\"otkyda\" was not injected: check your FXML file 'reis.fxml'.";
        assert samolet != null : "fx:id=\"samolet\" was not injected: check your FXML file 'reis.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'reis.fxml'.";
        assert timee != null : "fx:id=\"timee\" was not injected: check your FXML file 'reis.fxml'.";
        obnovit();
    }

}
