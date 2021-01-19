/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio_3;

import java.util.ArrayList;

/**
 *
 * @author indra
 */
public class App {

    static ArrayList<Apparecchi> listaApparecchi = new ArrayList<Apparecchi>();
    static ArrayList<Riparazioni> listaRiparazioni = new ArrayList<Riparazioni>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Officina.immissioneDecespugliatore("Hyundai", 100, true);

        Officina.stampa();

        Riparazioni riparazione = new Riparazioni("Cambio olio", 30);
        listaRiparazioni.add(riparazione);
        riparazione = new Riparazioni("Cambio lamine", 10);
        listaRiparazioni.add(riparazione);
        riparazione = new Riparazioni("Manodopera", 20);
        listaRiparazioni.add(riparazione);

    }
}
