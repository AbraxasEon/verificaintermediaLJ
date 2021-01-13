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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Veicolo v1 = new Auto(2010, 1200, "Volvo", 5, "Benzina");
        Veicolo v2 = new Auto(2012, 1600, "Audi", 5, "Diesel");
        Veicolo v3 = new Moto(2018, 800, "Honda", 4);
        Veicolo v4 = new Furgone(2015, 1900, "Mercedes", 8000);
        
        entrata(0, v1);
        System.out.println();
    }
    
}
