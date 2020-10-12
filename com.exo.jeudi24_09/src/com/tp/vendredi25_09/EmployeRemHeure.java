
package com.tp.vendredi25_09;

/**
 *
 * @author alliese
 */
public class EmployeRemHeure extends Employe{
    
    private int remHeure;
    private int nbHeure;

    public EmployeRemHeure(String prenom, String nom, int numSs, int remHeure, int nbHeure) {
        super(prenom, nom, numSs);
        this.remHeure = remHeure;
        this.nbHeure = nbHeure;
    }
    
    /**
     * @return the remHeure
     */
    public int getRemHeure() {
        return remHeure;
    }

    /**
     * @param remHeure the remHeure to set
     */
    public void setRemHeure(int remHeure) {
        this.remHeure = remHeure;
    }

    /**
     * @return the nbHeure
     */
    public int getNbHeure() {
        return nbHeure;
    }

    /**
     * @param nbHeure the nbHeure to set
     */
    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }
    
    
    /*
    public int aPayer(int salaire2){
        if(nbHeure > 168){
            System.err.println("Le maximum d'heure est 168");
        }if(nbHeure<=40){
            salaire2 = nbHeure * remHeure;
            return salaire2 ;
        }else {
            int nbHeurePlus = nbHeure -40;
            salaire2 = (40 * remHeure )+ (nbHeurePlus * remHeure)/2;
            return salaire2;
        }      
    }*/

   

    @Override
    public double aPayer() {
       
        if(nbHeure > 168){
            System.err.println("Le maximum d'heure est 168");
        }if(nbHeure<=40){
            int salaire2 = nbHeure * remHeure;
            return salaire2 ;
        }else {
            int nbHeurePlus = nbHeure -40;
            int salaire2 = (40 * remHeure )+ (nbHeurePlus * remHeure)/2;
            return salaire2;
        }      
    }
    
    
    
    
    
}
