/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.creational.abstractpattern;

/**
 *
 * @author bongani klaas
 */
public class MammalFactory extends SpeciesFactory{

    @Override
    public Animals getAnimal(String type) {
      if("dog".equals(type))
      {
          return new Dog();
          
      }
      else {
          return new Cat();
      }
    }
    
}
