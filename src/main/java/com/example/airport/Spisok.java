package com.example.airport;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import javax.swing.*;

public class Spisok {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button del;

    @FXML
    private Button e;

    @FXML
    private TableColumn<getsetPolz, String> fio;

    @FXML
    private TableColumn<getsetPolz, Integer> id;

    @FXML
    private TableColumn<getsetPolz, String> login;

    @FXML
    private Button n;

    @FXML
    private TableColumn<getsetPolz, String> pass;

    @FXML
    private TableColumn<getsetPolz, String> pocht;

    @FXML
    private TableView<getsetPolz> table;

    int index = -1;

    ObservableList<getsetPolz> getsetPolzs;

    Connection conn1 = null;

    PreparedStatement pst1 = null;

    @FXML
    void delete(ActionEvent event) {
        conn1 = connect.ConnectDb();

        String sql = "delete from polzov where id = ?";

        try{
            assert conn1 != null;
            pst1 = conn1.prepareStatement(sql);
            pst1.setString(1, id.getText());
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Delete");

            //obnovit();
        } catch (Exception e ){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void nazad(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("spisok.fxml"));
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 389, 207);
        Stage stage1 = new Stage();
        stage1.setTitle("Меню");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void initialize() {
        assert del != null : "fx:id=\"del\" was not injected: check your FXML file 'spisok.fxml'.";
        assert e != null : "fx:id=\"e\" was not injected: check your FXML file 'spisok.fxml'.";
        assert fio != null : "fx:id=\"fio\" was not injected: check your FXML file 'spisok.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'spisok.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'spisok.fxml'.";
        assert n != null : "fx:id=\"n\" was not injected: check your FXML file 'spisok.fxml'.";
        assert pass != null : "fx:id=\"pass\" was not injected: check your FXML file 'spisok.fxml'.";
        assert pocht != null : "fx:id=\"pocht\" was not injected: check your FXML file 'spisok.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'spisok.fxml'.";

    }

}
