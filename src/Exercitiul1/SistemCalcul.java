package Exercitiul1;

import java.io.Serializable;

enum SistemOperare
{
    Windows,
    Linux
}
@SuppressWarnings("serial")
public class SistemCalcul extends Echipament implements Serializable
{
    private String tip_mon;
    private double vit_proc;
    private int c_hdd;
    private SistemOperare sistem;

    public SistemCalcul(String denumire, int nr_inv, float pret, magazie zona_mag, String tip_mon, double vit_proc, int c_hdd, SistemOperare sistem) {
        super(denumire, nr_inv, pret, zona_mag);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sistem = sistem;
    }

    @Override
    public String toString() {
        return super.toString()+"Sistem de calcul; Monitor: " + tip_mon + "; Viteza de procesare: " + tip_mon + "; Capacitate HDD: " + c_hdd +
                "; Sistem de operare: " + sistem;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public double getVit_proc() {
        return vit_proc;
    }

    public int getC_hdd() {
        return c_hdd;
    }

    public SistemOperare getSistem() {
        return sistem;
    }

    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public void setVit_proc(double vit_proc) {
        this.vit_proc = vit_proc;
    }

    public void setC_hdd(int c_hdd) {
        this.c_hdd = c_hdd;
    }

    public void setSistem(SistemOperare sistem) {
        this.sistem = sistem;
    }
}