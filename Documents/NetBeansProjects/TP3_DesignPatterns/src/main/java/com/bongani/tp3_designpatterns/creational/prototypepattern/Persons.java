/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.creational.prototypepattern;

/**
 *
 * @author Bongani klaas
 */
public class Persons implements Prototype{
    
    String name ;
    
    public Persons(String name) 
    {
    this .name = name ;
    }


    @Override
    public Prototype doClone() 
        {
        return new Persons(name);
        }
        public String toString() {
            
        return "This person is named " + name ;
    }
    
}
