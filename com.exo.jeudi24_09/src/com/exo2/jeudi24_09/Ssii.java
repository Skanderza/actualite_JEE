
package com.exo2.jeudi24_09;

/**
 *
 * @author alliese
 */
public class Ssii {
    
    private String id;

    public Ssii(String id) {
        this.id = id;
        
    }
     
    public String employer(IDevelopper dev){
        return id + " " + dev.workAsDev() ;
    }
    
    
}
