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
public class Garage extends Veicolo {

    static ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();

    public static ArrayList<Veicolo> getVeicoli() {
        return veicoli;
    }

    public static void setVeicoli(ArrayList<Veicolo> veicoli) {
        Garage.veicoli = veicoli;
    }

    public void entrata(int index, Veicolo element) {
        veicoli.add(index, element);
    }

    public Veicolo uscita(int index) {
        return veicoli.remove(index);
    }
    
}
