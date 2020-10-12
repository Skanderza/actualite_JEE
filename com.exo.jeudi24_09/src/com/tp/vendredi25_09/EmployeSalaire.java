
package com.tp.vendredi25_09;

/**
 *
 * @author alliese
 */
public class EmployeSalaire extends Employe{

   
    
    private int salaire;

    public EmployeSalaire( String prenom, String nom, int numSs, int salaire) {
        super(prenom, nom, numSs);
        this.salaire = salaire;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    
  @Override
    public double aPayer() {
       return salaire;
    }
    
    
}
