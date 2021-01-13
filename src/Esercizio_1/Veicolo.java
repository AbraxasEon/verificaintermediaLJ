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
public class Veicolo {
    
    private int anno;
    private float cilindrata;
    private String marca;
    
    public Veicolo(int anno, float cilindrata, String marca) {
        this.anno = anno;
        this.cilindrata = cilindrata;
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public float getCilindrata() {
        return cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    String toString(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
