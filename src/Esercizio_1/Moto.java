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

    private int tempi;

    public Moto(int anno, int cilindrata, String marca, int tempi) {
        super(anno, cilindrata, marca);
        this.tempi = tempi;
    }

    public int getTempi() {
        return tempi;
    }

    @Override
    public String toString() {
        return super.toString("Marca: " + getMarca() + " | Anno: " + getAnno() + " | Cilindrata: " + getCilindrata() + " | Tempi: " + getTempi()); //To change body of generated methods, choose Tools | Templates.
    }

}
