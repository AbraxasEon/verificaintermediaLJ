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
public class Moto extends Veicolo {
    
    private final Tempi tempi;

    public static enum Tempi {
        DUE_TEMPI, QUATTRO_TEMPI
    }

    public Moto(int anno, int cilindrata, String marca, Tempi tempi) {
        super(anno, cilindrata, marca);
        this.tempi = tempi;
    }

    public Tempi getTempi() {
        return tempi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMoto > Tempi: " + getTempi() + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
