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
  public class Apparecchi {

    private static int numeroOrdine;
    private final String marca;
    private final float totaleRiparazione;

    public Apparecchi(String marca, float totaleRiparazione) {
        this.marca = marca;
        this.totaleRiparazione = totaleRiparazione;
        numeroOrdine++;
    }

    public static int getNumeroOrdine() {
        return numeroOrdine;
    }

    @Override
    public String toString() {
        String tx = "Numero ordine: " + numeroOrdine + "\nMarca: " + marca + "\nCosto riparazione: " + totaleRiparazione;
        return tx;
    }
}  
