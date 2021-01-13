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
    private String alimentazione;
    
    public Auto(int anno, int cilindrata, String marca, int porte, String alimentazione) {
        super(anno, cilindrata, marca);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    @Override
    public String toString() {
        return super.toString("Marca: " + getMarca() + " | Anno: "+ getAnno() +" | Clindrata: "+ getCilindrata() + " | Porte: " + getPorte() + " | Alimentazione: " + getAlimentazione()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
