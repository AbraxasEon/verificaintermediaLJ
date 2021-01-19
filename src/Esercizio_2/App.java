/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio_2;

/**
 *
 * @author indra
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Sim newSim = new Sim("3483006561", 65);
        Sim.chiama("3483006562", 8);
        Sim.chiama("3483006563", 16);
        Sim.chiama("3483006564", 12);
        System.err.println("\nTotale minuti in chiamata: " + Sim.calcoloMinuti());
        System.err.println("TotaleChiamate effettuate: " + Sim.totaleChiamate("3407064005"));
        Sim.stampa(0);

    }

}
