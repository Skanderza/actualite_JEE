/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp.vendredi25_09;

/**
 *
 * @author alliese
 */
public class EmployeRemCommissionBase extends Employe{
    
    private int somVentes;
    private double taux;
    private int base;

    public EmployeRemCommissionBase(String prenom, String nom, int numSs, int somVentes, double taux, int base) {
        super(prenom, nom, numSs);
        this.somVentes = somVentes;
        this.taux = taux;
        this.base = base;
    }

  
    public int getSomVentes() {
        return somVentes;
    }

    public double getTaux() {
        return taux;
    }

    public int getBase() {
        return base;
    }
    
    
  
    

    @Override
    public double aPayer() {
       if(this.taux<0.0 && this.taux>1.0){
            System.err.println("Taux incorrecte !!");
           int salaire4;
            return  salaire4 = 0;
        }else{
           double salaire4 = this.base + (this.somVentes * this.taux);
            return  salaire4;
        }
    }
}
