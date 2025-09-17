package com.example.airport;

public class getsetPolz {
    int id;
    String login;
    String pass;
    String fio;
    String pochta;
    String dolgnost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPochta() {
        return pochta;
    }

    public void setPochta(String pochta) {
        this.pochta = pochta;
    }

    public String getDolgnost() {
        return dolgnost;
    }

    public void setDolgnost(String dolgnost) {
        this.dolgnost = dolgnost;
    }


    public getsetPolz(int id, String login, String pass, String fio, String pochta, String dolgnost) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.fio = fio;
        this.pochta = pochta;
        this.dolgnost = dolgnost;
    }
}
