/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.chainofresponsibility;

import com.bongani.tp3_designpatterns.behavioral.chainofresponsibility.PlanetEnum;
import com.bongani.tp3_designpatterns.behavioral.chainofresponsibility.PlanetHandler;

/**
 *
 * @author bongani klaas
 */
public class VenusHandler extends PlanetHandler{
    
   public void handleRequest(PlanetEnum request) {
    if (request == PlanetEnum .VENUS) 
        {
        System .out.println("VenusHandler handles " + request);
        System .out.println("Venus is poisonous.\n");
        } 
        else 
        { System .out.println("VenusHandler doesn't handle " + request);
            if (successor != null) 
            {
            successor .handleRequest(request);
            }
        }
    }

    
}
