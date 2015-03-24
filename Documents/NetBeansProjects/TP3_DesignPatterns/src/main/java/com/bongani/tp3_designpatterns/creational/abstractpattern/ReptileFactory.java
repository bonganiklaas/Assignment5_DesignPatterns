/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.creational.abstractpattern;

/**
 *
 * @author Bongani klaas
 */
public class ReptileFactory extends SpeciesFactory{

    @Override
    public Animals getAnimal(String type) {
        if ("snake".equals(type)) {
    return new Snake() ;
        }
        else 
        { 
            return new Tyrannosaurus () ;
        }
     }
}

  
    
