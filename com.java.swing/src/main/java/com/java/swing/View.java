/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.swing;

import com.philou.cda.pattern2.IObservable;
import com.philou.cda.pattern2.IObserver;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author philou
 */
public class View extends JFrame implements IObserver{
    
    // On ajoute 2 panneaux
    private JPanel panneauBoutons;
    private JPanel panneauMain;
    
    private JButton bt1;
    private JTextField textField;
    
    public View(){
        super("Mon Appli Swing");
        
        // Instanciation des composants
        panneauBoutons = new JPanel();
        panneauMain = new JPanel();
        
        bt1 = new JButton("Click me !");
        textField = new JTextField(7);
        
        // On met le bouton dans le panneau bouton et le textfield dans le panneau main
        panneauBoutons.add(bt1);
        panneauMain.add(textField);
        
        // On met les panneaux dans le layout par défault de la JFrame 
        // JFrame ==> BorderLayout
        add(panneauBoutons, BorderLayout.NORTH);
        add(panneauMain, BorderLayout.CENTER);
        
            // JFrame physique
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // !!!!!!!!!!!
        setSize(500, 500);
        // Centrage de la fenêtre
        setLocationRelativeTo(null);
        setVisible(true);
          
    }

    /**
     * @return the bt1
     */
    public JButton getBt1() {
        return bt1;
    }

    @Override
    public void refresh(IObservable observable) {
        
        System.out.println("Le model a changé !");
        
        if(observable instanceof Model) {
            textField.setText(String.valueOf(((Model) observable).getNumber()));
        }
        
    }

    /**
     * @return the textField
     */
    /*public JTextField getTextField() {
        return textField;
    }*/




    
}
