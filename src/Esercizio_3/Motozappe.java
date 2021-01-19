/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio_3;

/**
 *
 * @author indra
 */
public class Motozappe extends Apparecchi {

    private final int numeroRuote;

    public Motozappe(String marca, float costoRiparazione, int numeroRuote) {        
        super(marca, costoRiparazione);
        this.numeroRuote = numeroRuote;        
    }

    @Override
    public String toString() {        
        String tx = super.toString() + "\nNumero ruote: " + numeroRuote;
        return tx;        
    }
    
}
