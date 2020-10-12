/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exo.jeudi24_09;

import java.util.Comparator;


public  class CompareClient implements Comparator<Client>{
    public int compare(Client c1, Client c2){
        if(c1.getFid()>c2.getFid()){
            return 1;
        }else{
            return -1;
        }
    }
    
    
    
}
