/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exo.jeudi24_09;

import java.util.List;

/**
 *
 * @author alliese
 */
public class Client {
    private String nom;
    private int fid;

    public Client(String nom, int fid) {
        this.nom = nom;
        this.fid = fid;
    }
   

   
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the fid
     */
    public int getFid() {
        return fid;
    }

    /**
     * @param fid the fid to set
     */
    public void setFid(int fid) {
        this.fid = fid;
    }

    /**
     * @return the listeClient
     */
   
    
    
}
