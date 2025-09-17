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

public class Popular {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button e;

    @FXML
    private Button n;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void nazad(ActionEvent event)  throws IOException {
        FXMLLoader fmxlLoader = new FXMLLoader(HelloApplication.class.getResource("popular.fxml"));
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bileti.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage1 = new Stage();
        stage1.setTitle("Билеты");
        stage1.setScene(scene1);
        stage1.show();

    }

    @FXML
    void initialize() {
        assert e != null : "fx:id=\"e\" was not injected: check your FXML file 'popular.fxml'.";
        assert n != null : "fx:id=\"n\" was not injected: check your FXML file 'popular.fxml'.";

    }

}
