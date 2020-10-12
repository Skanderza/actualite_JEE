
package com.exo2.jeudi24_09;

import com.exo2.jeudi24_09.architecte.Architecte;

/**
 *
 * @author alliese
 */
public class TestAdapter {
    
    public static void perform(){
        Ssii ssii = new Ssii("Ssii 1");
        IDevelopper dev = new Developper("developpeur1");
        //-------------------------------------------
        Architecte archi = new Architecte("architecte1");
        
        
        IDevelopper archiAdapte = new ArchitecteAdapte("Archi au milieu des dev1", archi);
        //on peu mettre ArchitecteAdapte a la place de IDevelopper
        // ArchitecteAdapte est un IDevelopper
        //Ssii fait travailler un dev
        System.out.println(ssii.employer(dev));
        //Ssii fait travailler un architecte
        System.out.println(ssii.employer(archiAdapte));
    }
    
}
