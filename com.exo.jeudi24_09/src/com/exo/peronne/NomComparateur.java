/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exo.peronne;

import java.util.Comparator;

/**
 *
 * @author alliese
 */
public class NomComparateur implements Comparator<Personne>{

    @Override
    public int compare(Personne personne1, Personne personne2) {
       return personne1.getPrenom().compareTo(personne2.getPrenom() );
    }
    
}
