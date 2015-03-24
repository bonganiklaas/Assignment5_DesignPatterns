/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.decoratorpattern;

import com.bongani.tp3_designpatterns.structural.decoratorpattern.AnimalS;
import com.bongani.tp3_designpatterns.structural.decoratorpattern.AnimalDecorator;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class LegDecorator extends AnimalDecorator {
    
        public LegDecorator(AnimalS animal) {
        super(animal);
        }
        @Override
        public void describe() {
        animal.describe() ;
        System .out.println("I have legs .");
        dance() ;
        }
        public void dance() {
        System .out.println("I can dance");
        }

    
}
