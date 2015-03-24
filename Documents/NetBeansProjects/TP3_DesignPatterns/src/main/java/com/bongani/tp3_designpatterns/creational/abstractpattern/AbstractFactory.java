/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.creational.abstractpattern;

/**
 *
 * @author Bongani Klaas
 */
public class AbstractFactory {
    public SpeciesFactory getSpeciesFactory(String type) {
    if ("mammal".equals(type)) {
    return new MammalFactory () ;
    }   
else 
    { return new ReptileFactory () ;
    
    }
  }
}
