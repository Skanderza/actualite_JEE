
package com.tp.vendredi25_09;

/**
 *
 * @author alliese
 */
public abstract class Employe implements ICalcul{
    
    private String prenom;
    private String nom;
    private int numSs;
   
    
    
     public Employe(String prenom, String nom, int numSs) {
        this.prenom = prenom;
        this.nom = nom;
        this.numSs = numSs;
       
    }

    

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the numSs
     */
    public int getNumSs() {
        return numSs;
    }

    /**
     * @param numSs the numSs to set
     */
    public void setNumSs(int numSs) {
        this.numSs = numSs;
    }

  

   
    
    
}
