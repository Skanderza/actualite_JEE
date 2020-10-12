
package com.exo2.jeudi24_09;

import com.exo2.jeudi24_09.architecte.Architecte;

/**
 *
 * @author alliese
 */
public class ArchitecteAdapte implements IDevelopper{
    
    
    private String id;
    private Architecte archi;

    public ArchitecteAdapte(String id, Architecte archi) {
        this.id = id;
        //Agregation
        this.archi = archi;
    }
    //On framework la maniere de travailler de l'architecte dans la maniere de tarvailler de
    //l'architecte adapté
    @Override
    public String workAsDev() {
       return archi.workAsArchi();
    }
    
}
