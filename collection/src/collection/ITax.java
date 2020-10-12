/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author philou
 */
@FunctionalInterface
public interface ITax {
    
    // Retourne le prix final du produit
    double applyTax(double price);

}


// @FunctionalInterface
// non obligatoire - garanti le check par le compilateur
