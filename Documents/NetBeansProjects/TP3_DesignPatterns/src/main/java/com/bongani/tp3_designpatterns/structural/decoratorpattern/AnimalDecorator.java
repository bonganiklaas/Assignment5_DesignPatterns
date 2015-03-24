/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.decoratorpattern;

import com.bongani.tp3_designpatterns.structural.decoratorpattern.AnimalS;

/**
 *
 * @author Bongani klaas
 */
public abstract class AnimalDecorator implements AnimalS{
    
    public AnimalS animal ;
public AnimalDecorator(AnimalS animal) {
this .animal = animal ;
}
    
}
