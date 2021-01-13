/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio_1;

/**
 *
 * @author indra
 */
public class Auto extends Veicolo {
    
    private int porte;
    private Alimentazione alimentazione;

    public static enum Alimentazione{
        Benzina, Diesel
    }

    public Auto(int anno, int cilindrata, String marca, int porte, Alimentazione alimentazione) {
        super(anno, cilindrata, marca);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nAuto > Porte: " + getPorte() + " | Alimentazione: " + getAlimentazione() + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
