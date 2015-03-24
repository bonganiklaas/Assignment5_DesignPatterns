/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.brigde;

import com.bongani.tp3_designpatterns.structural.brigde.Engine;
import com.bongani.tp3_designpatterns.structural.brigde.Vehicle;

/**
 *
 * @author bongani klaas
 */
public class SmallCar extends Vehicle{
    
        public SmallCar(Engine engine) {
        this .weightInKilos = 600;
        this .engine = engine ;
        }
        @Override
        public void drive() {
        System .out.println("\nThe small car is driving");
        int horsepower = engine .go() ;
        reportOnSpeed(horsepower);
        }
    
}
