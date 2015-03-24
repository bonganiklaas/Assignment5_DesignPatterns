/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.structural.decoratorpattern;

/**
 *
 * @author Mhumhu
 */
public class DecoratorMainDriver {
    public static void main(String[] args)
    {
        AnimalS animal = new LivingAnimal();
        animal.describe();
        
        animal = new LegDecorator(animal);
        animal.describe();
        
        animal = new WingDecorator(animal);
        animal.describe();
        
        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
        animal.describe();
    }
    
}
