package com.example.airport;

import java.util.Date;

public class getsetReis {
    int id;
    String samolet, otkyda, kyda;
    Date data;
    String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSamolet() {
        return samolet;
    }

    public void setSamolet(String samolet) {
        this.samolet = samolet;
    }

    public String getOtkyda() {
        return otkyda;
    }

    public void setOtkyda(String otkyda) {
        this.otkyda = otkyda;
    }

    public String getKyda() {
        return kyda;
    }

    public void setKyda(String kyda) {
        this.kyda = kyda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public getsetReis(int id, String samolet, String otkyda, String kyda, Date data, String time) {
        this.id = id;
        this.samolet = samolet;
        this.otkyda = otkyda;
        this.kyda = kyda;
        this.data = data;
        this.time = time;
    }
}
