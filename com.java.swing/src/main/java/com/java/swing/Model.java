/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.swing;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author philou
 */
public class Model implements IObservable{
    
    private int number;
    private List<IObserver> listeObservateurs;

    public Model() {
        listeObservateurs = new ArrayList();
    }
    
    
    public void plusOne(){
        System.out.println("1");
        ++number;
        notifier();
        
    }
    
    
    public void plusTen(){
        
        number += 10;
        notifier();
        
    }
    
    
    
    //---------------------------------------------------------------------------

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

   // @Override
    public void addObserver(IObserver obs) {
        listeObservateurs.add(obs);
    }

    //@Override
    public void removeObserver(IObserver obs) {
        
        listeObservateurs.remove(obs);
    }

    //@Override
    public void notifier() {
        System.out.println("2");
        listeObservateurs.stream().forEach(  (o) -> {
            
            o.refresh(this);
        
        });
        
    }
    
    
    
    
}
