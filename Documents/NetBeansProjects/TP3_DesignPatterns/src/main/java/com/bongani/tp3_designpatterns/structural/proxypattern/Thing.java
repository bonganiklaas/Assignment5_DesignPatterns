/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.proxypattern;

import java.util.Date;

/**
 *
 * @author Bongani klaas
 */
public abstract class Thing {
    public void sayHello() {
System .out.println(this .getClass() .getSimpleName () + "says howdy at " + new Date());
}

    
}
