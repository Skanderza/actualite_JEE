
package com.mycompany.actualite.beans;

import java.io.Serializable;

/**
 *
 * @author alliese
 */
public class Theme implements Serializable{
    
    private long idTheme;
    private String libelle;
    
    public Theme(){

    }

    /**
     * @return the idTheme
     */
    public long getIdTheme() {
        return idTheme;
    }

    /**
     * @param idTheme the idTheme to set
     */
    public void setIdTheme(long idTheme) {
        this.idTheme = idTheme;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}

