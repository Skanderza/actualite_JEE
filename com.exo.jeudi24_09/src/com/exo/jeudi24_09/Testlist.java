/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exo.jeudi24_09;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alliese
 */
class Testlist { 
    public static void perform1(){
        
        List<Integer> listFid = new ArrayList();
        List<Client> listClient = new ArrayList();
        
        //remplir liste fid
        for(int i = 0; i<10000; i++){
            listFid.add(random(0,10000));
        }
        //remplir liste client
        for(int i = 0; i<1000; i++){
            listClient.add( new Client("Client numero " + i, random(0,10000)) );
        }
        
         for(int i=0; i<listFid.size(); i++){
            //System.out.println(listFid.get(i));
        }
         System.out.println("-*********** Affichage 10 premier client ***************************************");
        for(int i=0; i<10; i++){
            System.out.print("Nom = " + listClient.get(i).getNom());
            System.out.println(" Point de fidélité = " + listFid.get(i));
        }
        System.out.println("-*********** Tri ***************************************");
        listClient.stream()
                .sorted(new CompareClient())
                .forEach(   p -> {System.out.println("Point de fidelité : "+ p.getFid()+" "+p.getNom());}   );
        
        // System.out.println("-*********** Tri ***************************************");
         // List<Integer> listeFidSup9500 = listFid.stream()
           //     .filter( n -> n > 9500)
             //   .collect(Collectors.toList() );
        //for(int i=0; i<listeFidSup9500.size(); i++){
            //System.out.println(listeNombresBeyondFifty );
            
            
System.out.println("-*********** Tri ***************************************");
       System.out.println("FID > 9000");
        listFid.stream()
                .filter(nb -> nb > 9000)
                .forEach(nb -> {
                   // System.out.printf("Fid = %d %n", nb);
                });
          System.out.println("*********************************************************************");

        listClient.stream()
                .filter(p -> p.getFid()> 9000)
                .forEach(p -> {
            System.out.printf("Nom = %s - Solde = %d %n", p.getNom(), p.getFid());
        });
     
    System.out.println("-*********** Ajout 100 au FID ***************************************");
     //map(traitement à effectuer pour modifier l'element)
        List<Integer>listeNombresPlus100 = listFid.stream()
        		.map( n -> n + 100)
        		.collect(Collectors.toList());
        System.out.println(listeNombresPlus100);  
      //  listClient.stream()
       //         .filter(p -> p.getFid()>9500)
        //        .forEach(   p -> {System.out.println("Nouveau point de fidelité : "+ p.getFid()+" "+p.getNom());}   );
        
      
    }
     
         
      

    private static int random(double min, double max){
        return (int)((Math.random() * ( max - min+1 )) + min); 
    }


     

    
}
