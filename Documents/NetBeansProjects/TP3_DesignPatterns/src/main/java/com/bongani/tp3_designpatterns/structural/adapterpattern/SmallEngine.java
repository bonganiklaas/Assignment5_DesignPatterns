/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.adapterpattern;

import com.bongani.tp3_designpatterns.structural.brigde.Engine;

/**
 *
 * @author bongani klaas
 */
public class SmallEngine implements Engine {
    
    int horsepower ;
    public SmallEngine () {
    horsepower = 100;
    }
    @Override
    public int go() {
    System .out.println("The small engine is running");
    return horsepower ;
    }

    
}
