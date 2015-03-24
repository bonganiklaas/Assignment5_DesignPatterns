/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.chainofresponsibility;

import com.bongani.tp3_designpatterns.behavioral.chainofresponsibility.PlanetEnum;
import com.bongani.tp3_designpatterns.behavioral.chainofresponsibility.PlanetHandler;

/**
 *
 * @author Bongani klaas
 */
public class EarthHandler extends PlanetHandler {
    
public void handleRequest(PlanetEnum request) {
    if (request == PlanetEnum .EARTH) {
        System .out.println("EarthHandler handles " + request);
        System .out.println("Earth is comfortable.\n");
        } 
        else 
        { 
        System .out.println("EarthHandler doesn't handle "+ request);
            if (successor != null) {
            successor .handleRequest(request);
            }
        }
}

    
}
