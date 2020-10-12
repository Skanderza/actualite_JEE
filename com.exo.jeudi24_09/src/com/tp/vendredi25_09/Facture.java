
package com.tp.vendredi25_09;

/**
 *
 * @author alliese
 */
public class Facture implements ICalcul{
    private int reference;
    private String description;
    private int prixU;
    private int quantite;
    

    public Facture(int reference, String description, int prixU, int quantite) {
        this.reference = reference;
        this.description = description;
        this.prixU = prixU;
        this.quantite = quantite;
        
    }
 
   

    @Override
    public double aPayer() {
        int totalFacture = prixU * quantite;
        return totalFacture;
    }
    
    
    
}
