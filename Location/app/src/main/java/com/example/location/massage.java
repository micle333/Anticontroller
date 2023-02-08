package com.example.location;

import java.util.Date;

public class massage {
    public double Langt;
    public double Latit;
    private long massageTime;
    public massage() {}
    public massage(double Lang, double Lati){
        this.Langt = Lang;
        this.Latit = Lati;
        this.massageTime = new Date().getTime();
    }

    public double getLang() {
        return Langt;
    }

    public void setLang(double lang) {
        Langt = lang;
    }

    public double getLati() {
        return Latit;
    }

    public void setLati(double lati) {
        Latit = lati;
    }

    public long getMassageTime() {
        return massageTime;
    }

    public void setMassageTime(long massageTime) {
        this.massageTime = massageTime;
    }
}
