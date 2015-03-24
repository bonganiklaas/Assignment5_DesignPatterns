/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.creational.builderpattern;

/**
 *
 * @author Bongani klaas
 */
public class MealDirector {
        private MealBuilder mealBuilder = null ;
        
        public MealDirector(MealBuilder mealBuilder) {
            
        this .mealBuilder = mealBuilder ;
        }public void constructMeal () {
        mealBuilder .buildDrink() ;
        mealBuilder .buildMainCourse () ;
        mealBuilder .buildSide() ;
        }public Meal getMeal() {
        return mealBuilder .getMeal() ;
        }

    
}
