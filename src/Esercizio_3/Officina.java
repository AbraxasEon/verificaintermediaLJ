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
public class Officina {
    
     static void acquisizioneDecespugliatore(String marca, float costoRiparazione, boolean accensioneElettronica) {
         
        if (App.listaApparecchi.size() < 10) {
            Decespugliatori decespugliatore = new Decespugliatori(marca, costoRiparazione, accensioneElettronica);
            App.listaApparecchi.add(decespugliatore);
        } else {
            System.out.println("Officina piena");
        }
        
    }

    static void acquisizioneMotozappa(String marca, float costoRiparazione, int numeroRuote) {
        
        if (App.listaApparecchi.size() < 10) {
            Motozappe Motozappa = new Motozappe(marca, costoRiparazione, numeroRuote);
            App.listaApparecchi.add(Motozappa);
        } else {
            System.out.println("Officina piena");
        }
        
    }

    static void acquisizioneTosaerba(String marca, float costoRiparazione, int numeroRuote) {
        
        if (App.listaApparecchi.size() < 10) {
            Tosaerba Tosaerba = new Tosaerba(marca, costoRiparazione, numeroRuote);
            App.listaApparecchi.add(Tosaerba);
        } else {
            System.out.println("Officina piena");
        }
        
    }

    static void stampa() {
        
        for (Apparecchi a : App.listaApparecchi) {
            System.out.println("-----STAMPA-----");
            System.out.println(a.toString() + "\n");
            
        }

    }
    
}
