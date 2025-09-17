package com.example.airport;

import java.io.IOException;
import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class connect {
    public static Connection ConnectDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/isp1", "root", "");
            JOptionPane.showMessageDialog(null, "Соединение установлено");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public static ObservableList<getsetPolz> getsetPolzs() {
        Connection connTABL = ConnectDb();
        ObservableList<getsetPolz> list = FXCollections.observableArrayList();
        try {
            assert connTABL != null;
            PreparedStatement ps1 = connTABL.prepareStatement("select * from polzov");
            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()) {
                list.add(new getsetPolz(Integer.parseInt(rs1.getString("id")),
                        rs1.getString("login"),
                        rs1.getString("pass"),
                        rs1.getString("fio"),
                        rs1.getString("pochta"),
                        rs1.getString("dolgnost")));
            }
        } catch (Exception ignored) {
        }
        return list;
    }

    public static ObservableList<getsetReis> getsetReisi() {
        Connection connTABL = ConnectDb();
        ObservableList<getsetReis> list = FXCollections.observableArrayList();
        try {
            assert connTABL != null;
            PreparedStatement ps2 = connTABL.prepareStatement("select * from reis");
            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next())
                list.add(new getsetReis(Integer.parseInt(rs2.getString("id")),
                        rs2.getString("samolet"),
                        rs2.getString("otkyda"),
                        rs2.getString("kyda"),
                        rs2.getDate("data"),
                        rs2.getString("time")));
        } catch (Exception ignored) {

        }
        return list;
    }
}
