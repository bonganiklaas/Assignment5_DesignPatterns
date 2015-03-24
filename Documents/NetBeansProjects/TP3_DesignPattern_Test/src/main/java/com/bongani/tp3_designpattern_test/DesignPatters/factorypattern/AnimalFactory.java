/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpattern_test.DesignPatters.factorypattern;

/**
 *
 * @author Bongani klaas
 */
public class AnimalFactory {
    
    public Animal getAnimal(String type)
    {
        if("canine".equals(type))
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }
    }
    
}
