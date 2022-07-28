package com.example.spring.prac;

public class Vo {

    private int date;
    private String title;
    private String name;
    private String pass;
    private String gesi;

    public Vo() {

    }

    public Vo(int date, String title, String name, String pass, String gesi) {
        super();
        this.date = date;
        this.title = title;
        this.name = name;
        this.pass = pass;
        this.gesi = gesi;
    }

    public int getdate() {
        return date;
    }

    public void setdate(int date) {
        this.date = date;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getgesi() {
        return gesi;
    }

    public void setgesi(String gesi) {
        this.gesi = gesi;
    }


}
