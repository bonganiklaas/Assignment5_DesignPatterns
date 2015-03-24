/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.decoratorpattern;

import com.bongani.tp3_designpatterns.structural.decoratorpattern.AnimalS;
import com.bongani.tp3_designpatterns.structural.decoratorpattern.AnimalDecorator;

/**
 *
 * @author Boongani klaas
 */
public class GrowlDecorator extends AnimalDecorator {
    
            public GrowlDecorator(AnimalS animal) {
        super(animal);
        }
        @Override
        public void describe() {
        animal .describe() ;
        growl() ;
        }
        public void growl() {
        System .out.println("Grrrrr.");
        }

    
}
