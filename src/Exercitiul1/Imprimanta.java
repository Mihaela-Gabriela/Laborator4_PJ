package Exercitiul1;

import java.io.Serializable;

enum Tiparire
{
    color,
    alb_negru
}
@SuppressWarnings("serial")
public class Imprimanta extends Echipament implements Serializable
{
    private int ppm;
    private float dpi;
    private int p_car;
    private Tiparire mod_tiparire;

    public Imprimanta(String denumire, int nr_inv, float pret, magazie zona_mag, int ppm, float dpi, int p_car, Tiparire mod_tiparire) {
        super(denumire, nr_inv, pret, zona_mag);
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;
    }
    @Override
    public String toString() {
        return super.toString() + "Imprimanta; Pagini pe minut: " + ppm + "; Rezolutie: " + dpi + "; Pagini/cartus: " + p_car + "; Mod scriere: "
                +mod_tiparire;

    }

    public int getPpm() {
        return ppm;
    }

    public float getDpi() {
        return dpi;
    }

    public int getP_car() {
        return p_car;
    }

    public Tiparire getMod_tiparire() {
        return mod_tiparire;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public void setDpi(float dpi) {
        this.dpi = dpi;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public void setMod_tiparire(Tiparire mod_tiparire) {
        this.mod_tiparire = mod_tiparire;
    }
}