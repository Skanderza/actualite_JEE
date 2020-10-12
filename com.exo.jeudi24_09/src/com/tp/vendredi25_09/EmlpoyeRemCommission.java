
package com.tp.vendredi25_09;

/**
 *
 * @author alliese
 */
public class EmlpoyeRemCommission extends Employe{
    private int somVentes;
    private double taux;

    public EmlpoyeRemCommission(String prenom, String nom, int numSs, int somVentes, double taux ) {
        super(prenom, nom, numSs);
        this.somVentes = somVentes;
        this.taux = taux;
    }

    
    
    /**
     * @return the somVentes
     */
    public int getSomVentes() {
        return somVentes;
    }

    /**
     * @param somVentes the somVentes to set
     */
    public void setSomVentes(int somVentes) {
        this.somVentes = somVentes;
    }

    /**
     * @return the taux
     */
    public double getTaux() {
        return taux;
    }

    /**
     * @param taux the taux to set
     */
    public void setTaux(int taux) {
        this.taux = taux;
    }
    
    
    @Override
    public double aPayer() {
           if(taux<0.0 && taux>1.0){
            System.err.println("Taux incorrecte !!");
               int salaire3;
            return  salaire3 = 0;
        }else{
               double salaire3 = somVentes * taux;
            return  salaire3;
        }
        
    }
}
