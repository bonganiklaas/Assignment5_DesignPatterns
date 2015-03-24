/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.template;

/**
 *
 * @author Bongani klaas
 */
public abstract class Meals {
    
        public final void doMeal() {
        prepareIngredients () ;
        cook() ;
        eat() ;
        cleanUp() ;
        }
        public abstract void prepareIngredients () ;
        public abstract void cook() ;
        public void eat() {
        System .out.println("Mmm, that's good");
        }
        public abstract void cleanUp() ;

    
}
