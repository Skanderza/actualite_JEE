/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.swing;

import javax.swing.SwingUtilities;

/**
 *
 * @author philou
 */
public class TestSwing {
    
    
    public static void perform(){
        
        // Meilleur comportement de l'appli swing (redimmensionnement, ....)
        SwingUtilities.invokeLater( () -> {
        try {
            
            Model model = new Model();
            View vue = new View();
            Controller controller = new Controller(vue, model);
            
            controller.buildControls();
        
        }
        catch (Exception e) {
        }
        });
        
        
        
        
    }
    
}
