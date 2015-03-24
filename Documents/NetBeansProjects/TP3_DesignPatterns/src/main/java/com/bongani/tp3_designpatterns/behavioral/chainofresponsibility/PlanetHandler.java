/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.chainofresponsibility;

/**
 *
 * @author bongani klaas
 */
public abstract class PlanetHandler {

    public PlanetHandler successor ;
    public void setSuccessor(PlanetHandler successor) {
    this .successor = successor ;
    }
    public abstract void handleRequest(PlanetEnum request);

}
