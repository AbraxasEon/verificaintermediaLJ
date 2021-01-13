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
public class Furgone extends Veicolo {

    private int capacita;
    
    public Furgone(int anno, int cilindrata, String marca, int capacita) {
        super(anno, cilindrata, marca);
        this.capacita = capacita;
    }

    public int getCapacita() {
        return capacita;
    }

    @Override
    public String toString() {
        return super.toString("Marca; " + getMarca() + " | Anno: " + getAnno() + " | Cilindrata: " + getCilindrata() + " | Capacita: " + getCapacita()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
