package Exercitiul1;

import java.io.Serializable;

enum Stare{
    achizitionat,
    expus,
    vandut
}


public class Echipament implements Serializable
{
    private String denumire;
    private int nr_inv;
    private float pret;
    private magazie zona_mag;

    public Echipament(String denumire, int nr_inv, float pret, magazie zona_mag) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
    }
    @Override
    public String toString() {
        return "Denumire: " + denumire + "; Numar inventar: " + nr_inv + "; Pret: " + pret + "; Zona magazin: "
                + zona_mag;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public float getPret() {
        return pret;
    }

    public magazie getZona_mag() {
        return zona_mag;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void setZona_mag(magazie zona_mag) {
        this.zona_mag = zona_mag;
    }
}