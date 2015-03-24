/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.creational.factorypattern;

/**
 *
 * @author Mhumhu
 */
public class FactoryMainDriver {
    public static void main(String[] args)
    {
        AnimalFactory animalFactory = new AnimalFactory();
        
        Animal animal1 = animalFactory.getAnimal("feline");
        System.out.println("animal1 sound:" + animal1.makeSound());
        
        Animal animal2 = animalFactory.getAnimal("canine");
        System.out.println("animal2 sound:" + animal2.makeSound());
    }
}
