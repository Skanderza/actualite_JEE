/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.swing;

/**
 *
 * @author alliese
 */
public interface IObservable {
    
      void addObserver(IObserver obs);
    void removeObserver(IObserver obs);
    void notifier();
    
}
