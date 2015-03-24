/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.creational.abstractpattern;

/**
 *
 * @author Mhumhu
 */
public class AbstractMainDriver {
    public static void main(String[] args)
    {
        AbstractFactory abstractFactory = new AbstractFactory();
        
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        Animals a1 = speciesFactory1.getAnimal("tyrannosauruns");
        System.out.println("a1 sound:" + a1.makeSound());
        Animals a2 = speciesFactory1.getAnimal("snake");
        System.out.println("a2 sound:" + a2.makeSound());
        
        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animals a3 = speciesFactory2.getAnimal("dog");
        System.out.println("a3 sound:" + a3.makeSound());
        Animals a4 = speciesFactory2.getAnimal("cat");
        System.out.println("a4 sound:" + a4.makeSound());
    }
    
}
