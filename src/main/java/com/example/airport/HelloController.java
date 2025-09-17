package com.example.airport;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> dolg;

    @FXML
    private TextField log;

    @FXML
    private TextField pas;

    @FXML
    private Button register;

    @FXML
    private Button vxod;

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String box = null;

    @FXML
    void reg(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage stage = (Stage) register.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("register.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 527, 404);
        Stage stage1 = new Stage();
        stage1.setTitle("Регистрация");
        stage1.setScene(scene1);
        stage1.show();
    }

    @FXML
    void dolgnost(ActionEvent event) {
        box = dolg.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void vx() throws SQLException, IOException {
        conn = connect.ConnectDb();

        String sql = "Select * from polzov where login = ? and pass = ? and dolgnost = ?";

        pst = conn.prepareStatement(sql);
        try {

            pst.setString(1, log.getText());
            pst.setString(2, pas.getText());
            pst.setString(3, dolg.getSelectionModel().getSelectedItem().toString());

            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Данные введены верно");

                if (Objects.equals(box, "Сотрудник")) {
                    Stage stage2 = (Stage) vxod.getScene().getWindow();
                    stage2.close();

                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
                    Scene scene2 = new Scene(fxmlLoader.load(), 389, 207);
                    Stage stage3 = new Stage();
                    stage3.setTitle("Меню Сотрудника");
                    stage3.setScene(scene2);
                    stage3.show();
                } else if (Objects.equals(box, "Пользователь")) {
                    Stage stage1 = (Stage) vxod.getScene().getWindow();
                    stage1.close();

                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bileti.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                    Stage stage = new Stage();
                    stage.setTitle("Меню Пользователя");
                    stage.setScene(scene);
                    stage.show();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Данные введены НЕВЕРНО");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @FXML
    void initialize() {
        assert dolg != null : "fx:id=\"dolg\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert log != null : "fx:id=\"log\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pas != null : "fx:id=\"pas\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vxod != null : "fx:id=\"vxod\" was not injected: check your FXML file 'hello-view.fxml'.";
        ObservableList<String> list = FXCollections.observableArrayList("Пользователь", "Сотрудник");
        dolg.setItems(list);
    }

}
