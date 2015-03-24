/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.decoratorpattern;

import com.bongani.tp3_designpatterns.structural.decoratorpattern.AnimalS;



/**
 *
 * @author Rhulani Steff Baloyi
 */
public class LivingAnimal implements AnimalS{
    
 @Override
public void describe() {
System .out.println("\nI am an animal.");
}

    
}
