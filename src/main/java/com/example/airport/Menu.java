package com.example.airport;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Menu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button e;

    @FXML
    private Button n;

    @FXML
    private Button re;

    @FXML
    private Button sppol;

    @FXML
    void exit(ActionEvent event) {
System.exit(0);
    }

    @FXML
    void nazad(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage1 = new Stage();
        stage1.setTitle("Авторизация");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void reis(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Stage stage = (Stage) re.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("reis.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage1 = new Stage();
        stage1.setTitle("Рейсы");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void spisok(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Stage stage = (Stage) sppol.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("spisok.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage1 = new Stage();
        stage1.setTitle("Список пользователей");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void initialize() {
        assert e != null : "fx:id=\"e\" was not injected: check your FXML file 'menu.fxml'.";
        assert n != null : "fx:id=\"n\" was not injected: check your FXML file 'menu.fxml'.";
        assert re != null : "fx:id=\"re\" was not injected: check your FXML file 'menu.fxml'.";
        assert sppol != null : "fx:id=\"sppol\" was not injected: check your FXML file 'menu.fxml'.";

    }

}
