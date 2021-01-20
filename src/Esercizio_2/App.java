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
        Sim.chiama(8, "3483006562");
        Sim.chiama(16, "3483006563");
        Sim.chiama(12, "3483006564");
        System.err.println("\nMinuti chiamata: " + Sim.calcoloMinuti());
        System.err.println("Chiamate effettuate: " + Sim.totaleChiamate("3483006565"));
        Sim.stampa(0);

    }

}
