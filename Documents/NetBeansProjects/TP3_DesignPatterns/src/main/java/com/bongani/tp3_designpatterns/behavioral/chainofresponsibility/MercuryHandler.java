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
public class MercuryHandler extends PlanetHandler{
    
   public void handleRequest(PlanetEnum request)
   {
        if (request == PlanetEnum .MERCURY) {

        System .out.println("MercuryHandler handles " + request);
        System .out.println("Mercury is hot.\n");
        } else 
        { System .out.println("MercuryHandler doesn't handle " + request);
            if(successor != null) 
            {
            successor .handleRequest(request);
            }
        }
    }
    
}
