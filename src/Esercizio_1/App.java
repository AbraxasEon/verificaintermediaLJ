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
        
try {
    
            Garage g = new Garage(15);

            immissioneInGarage(g, new Auto(2010, 1200, "Volvo", 5, Auto.Alimentazione.Benzina));

            g.situazione();

            immissioneInGarage(g, new Moto(2018, 800, "Honda", Moto.Tempi.QUATTRO_TEMPI));

            g.situazione();

            Veicolo uscito = uscitaGarage(g, 20);

            System.out.println("È uscito il veicolo:\n" + uscito);

            g.situazione();

            immissioneInGarage(g, new Furgone(2015, 1800, "Fiat", 3000));

            g.situazione();

        } catch (Exception e) {
            System.out.println("Ops, qualcosa è andato storto...");
        }
    }

    public static void immissioneInGarage(Garage g, Veicolo v) {
        try {
            g.entrata(v);
        } catch (GarageException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Veicolo uscitaGarage(Garage g, int posto) {
        try {
            return g.uscita(posto);
        } catch (GarageException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
