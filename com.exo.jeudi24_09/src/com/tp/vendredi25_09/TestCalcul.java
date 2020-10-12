/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp.vendredi25_09;

import java.util.ArrayList;

/**
 *
 * @author alliese
 */
public  class TestCalcul {
    public static void perform4(){
       Employe emSalaire = new EmployeSalaire("Nicolas", "SARKOZY", 123456, 2000);
       Employe emRemHeure = new EmployeRemHeure("Francois", "HOLLANDE", 432598, 50, 50);
       Employe emRemCommission = new EmlpoyeRemCommission("Jaques", "CHIRAC", 654376, 8000,0.4);
       Employe emRemCommissionBase = new EmployeRemCommissionBase("Emmanuel", "Macron", 786509, 9200, 0.4, 1000);
       Amande amande = new Amande(1000);
       Facture facture = new Facture(87543, "Facture fournisseur", 20, 1000);
       
       
        System.out.println(emSalaire.getNom() +" "+ emSalaire.aPayer());
        System.out.println(emRemHeure.getNom() +" "+emRemHeure.aPayer());
        System.out.println(emRemCommission.getNom() +" "+emRemCommission.aPayer());
        System.out.println(emRemCommissionBase.getNom() +" "+emRemCommissionBase.aPayer());
        System.out.println(amande.aPayer());
        System.out.println(facture.aPayer());
        
        ArrayList<ICalcul> listeEmploye = new ArrayList<>();
        
        listeEmploye.add(emSalaire);
        listeEmploye.add(emRemHeure);
         listeEmploye.add(emRemCommission);
          listeEmploye.add(emRemCommissionBase);
          
      
        
        listeEmploye.add(emSalaire);
        listeEmploye.add(emRemHeure);
         listeEmploye.add(emRemCommission);
          listeEmploye.add(emRemCommissionBase);
          
        
          
           for(ICalcul totalCalcul : listeEmploye ){
              totalCalcul.aPayer();
              System.out.println(totalCalcul);
          }
           System.out.println("----------------");
          for(ICalcul totalCalcul : listeEmploye ){
              totalCalcul.aPayer();
              System.out.println(totalCalcul);
          }
          System.out.println("----------------");

    }
}

          
          
          
   