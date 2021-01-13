/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio_1;

import java.util.ArrayList;

/**
 *
 * @author indra
 */
public class Garage {

    private ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>(15);

    private final int posti;

    public Garage(int posti) {
        this.posti = posti;
    }
    
      public int getPosti() {
        return posti;
    }

    public void entrata(Veicolo v) {
        if (postoLibero() == -1) {
            throw new GarageException("Il garage è pieno");
        }
        veicoli.set(postoLibero(), v);
    }

    public Veicolo uscita(int posto) {
        if (posto >= this.posti || veicoli.get(posto) == null) {
            throw new GarageException("Il posto non esiste oppure è vuoto");
        }
        Veicolo v = veicoli.get(posto);
        veicoli.set(posto, null);
        return v;
    }

    public void situazione() {
        for (int posto = 0; posto < veicoli.size(); posto++) {
            if (veicoli.get(posto) != null) {
                System.out.println("--------------- POSTO " + posto + " ---------------");
                System.out.println(veicoli.get(posto));
                System.out.println("-------------------------");
                System.out.println();
            }

        }
    }

    public boolean isLibero() {
        return postoLibero() != -1;
    }

    private void inizializza() {
        for (int i = 0; i < this.posti; i++) {
            veicoli.add(null);
        }
    }

    private int postoLibero() {
        return veicoli.indexOf(null);
    }
}
