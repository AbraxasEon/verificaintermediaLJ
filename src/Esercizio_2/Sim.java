/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio_2;

import java.util.ArrayList;

/**
 *
 * @author indra
 */
public class Sim {
    
    private static String numero;
    private float credito;
    private static ArrayList<Chiamata> listaChiamate = new ArrayList<Chiamata>();

     public Sim(String numero, float credito) {       
         
        this.numero = numero;
        this.credito = credito;        
        
    }

    static void chiama(int durata, String numeroChiamato) {
        
        Chiamata chiamata = new Chiamata(durata, numeroChiamato);
        listaChiamate.add(chiamata);
        
    }

    static int calcoloMinuti() {
        
        int totaleMinuti = 0;
        for (Chiamata c : listaChiamate) {
            totaleMinuti += c.getDurata();
        }
        return totaleMinuti;
        
    }

    static int totaleChiamate(String numeroChiamato) {
        int totaleChiamate = 0;
        for (Chiamata c : listaChiamate) {
            if (c.getNumeroChiamato().equals(numeroChiamato)) {
                totaleChiamate++;
            }
        }
        return totaleChiamate;
        
    }

    static void stampa(int i) {
        
        String tx = "";
        tx += "Numero: " + numero + "\nCHIAMATE EFFETTUATE";
        
        for (Chiamata c : listaChiamate) {
            
            tx += "\nNumero chiamato: " + c.getNumeroChiamato() + " - Minuti conversazione: " + c.getDurata();
            
        }
        
        System.out.println(tx);

    }
    
}
