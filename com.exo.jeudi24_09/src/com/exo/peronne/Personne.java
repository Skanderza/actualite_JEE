
package com.exo.peronne;

/**
 *
 * @author alliese
 */
public class Personne implements Comparable<Personne>{


  private String nom;
    private String prenom;
    
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return nom + " " + prenom ;
    }
    
    
    @Override
    public int compareTo(Personne autrePersonne) {
        int comparaison = nom.compareTo(autrePersonne.nom);
        if(comparaison == 0){
            return prenom.compareTo(autrePersonne.prenom);
        }else{
            return comparaison;
        }
        
        
    }
 
}
