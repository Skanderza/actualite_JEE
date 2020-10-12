
package com.exo2.jeudi24_09;

/**
 *
 * @author alliese
 */
public class Developper implements IDevelopper{
    private String id;

    public Developper(String id) {
        this.id = id;
    }
    
   

    @Override
    public String workAsDev() {
       return id + " Working as dev";
    }
    
}
