/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.proxypattern;

import com.bongani.tp3_designpatterns.structural.proxypattern.Thing;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class SlowThing extends Thing{
    public SlowThing() {
    try {
    Thread .sleep(5000);
    } 
    catch (InterruptedException e) {
        e.printStackTrace () ;
    }
   }
}
