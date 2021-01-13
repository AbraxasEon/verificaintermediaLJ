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
    
    private static int counter;
    private final int id;
    private final int anno;
    private final int cilindrata;
    private final String marca;

    public Veicolo(int anno, int cilindrata, String marca) {
        this.id = ++counter;
        this.anno = anno;
        this.cilindrata = cilindrata;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public int getAnno() {
        return anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }
    
    public String getMarca() {
        return marca;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veicolo other = (Veicolo) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Veicolo > Marca: " + getMarca() + " | Anno: "+ getAnno() + " | Cilindrata: " + getCilindrata() + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
