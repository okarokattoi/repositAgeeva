package com.example.airport;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class Register {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private ComboBox<String> dolg;

    @FXML
    private TextField email;

    @FXML
    private TextField fio;

    @FXML
    private TextField login;

    @FXML
    private Button na;

    @FXML
    private TextField pass;

    @FXML
    private Button register;

    @FXML
    private CheckBox soglass;

    Connection conn = null;
    PreparedStatement pst = null;

    @FXML
    void nazad(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("register.fxml"));
        Stage stage = (Stage) na.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 404);
        Stage stage1 = new Stage();
        stage1.setTitle("Авторизация");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void reg(ActionEvent event) {
        conn = connect.ConnectDb();


        if(soglass.isSelected()){
            // text
            String username2 = login.getText().toString();
            String pass1 = pass.getText().toString();
            String username = fio.getText().toString();
            String Email = email.getText().toString();
            //chislo
            String dolgn = dolg.getSelectionModel().getSelectedItem().toString();

            //galochka

            String soglas = "";
            if (soglass.isSelected()) soglas += "Даю согласие";
            conn = connect.ConnectDb();

            //Внесение в таблицу

            String sql = "insert into polzov(login, pass, fio, pochta, dolgnost) values(?, ?, ?, ?, ?)";
            try{
                assert conn != null;
                pst = conn.prepareStatement(sql);

                pst.setString(1, username);
                pst.setString(2, username2);
                pst.setString(3, pass1);
                pst.setString(4, Email);
                pst.setString(5, dolgn);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Пользователь зарегестрирован");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }

    @FXML
    void initialize() {
        assert dolg != null : "fx:id=\"dol\" was not injected: check your FXML file 'register.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'register.fxml'.";
        assert fio != null : "fx:id=\"fio\" was not injected: check your FXML file 'register.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'register.fxml'.";
        assert na != null : "fx:id=\"na\" was not injected: check your FXML file 'register.fxml'.";
        assert pass != null : "fx:id=\"pass\" was not injected: check your FXML file 'register.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'register.fxml'.";
        assert soglass != null : "fx:id=\"soglass\" was not injected: check your FXML file 'register.fxml'.";
        ObservableList<String> list = FXCollections.observableArrayList("Пользователь");
    }

}
