/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.proxypattern;

import com.bongani.tp3_designpatterns.structural.proxypattern.SlowThing;
import java.util.Date;

/**
 *
 * @author Bongani klaas
 */
public class Proxy {
    
    SlowThing slowThing ;
    public Proxy() {
    System .out.println("Creating proxy at " + new Date());
    }
    public void sayHello() {
        
    if (slowThing == null) {
        
    slowThing = new SlowThing() ;
    }
    slowThing .sayHello() ;
    }

}
