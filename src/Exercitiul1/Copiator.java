package Exercitiul1;

import java.io.Serializable;

enum Format
{
    A3,
    A4
}
@SuppressWarnings("serial")
public class Copiator extends Echipament implements Serializable
{
    private int p_ton;
    private Format copiere;

    public Copiator(String denumire, int nr_inv, float pret, magazie zona_mag, int p_ton, Format copiere) {
        super(denumire, nr_inv, pret, zona_mag);
        this.p_ton = p_ton;
        this.copiere = copiere;
    }
    @Override
    public String toString()
    {
        return super.toString() + "Copiator; Pagini pe toner: " + p_ton + "; Formatul de copiere: " + copiere;
    }


    public int getP_ton() {
        return p_ton;
    }

    public Format getCopiere() {
        return copiere;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public void setCopiere(Format copiere) {
        this.copiere = copiere;
    }
}