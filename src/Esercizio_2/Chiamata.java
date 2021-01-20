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
public class Chiamata {
    
    private int durata;
    private String numeroChiamato;    

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }
    
}
