/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.template;

import com.bongani.tp3_designpatterns.behavioral.template.Meals;

/**
 *
 * @author Bongani klaas
 */
public class HamburgerMeal extends Meals {
    
            @Override
        public void prepareIngredients () {
        System .out.println("Getting burgers , buns, and french fries");
        }
        @Override
        public void cook() {
        System .out.println("Cooking burgers on grill and fries in oven");
        }
        @Override
        public void cleanUp() {
        System .out.println("Throwing away paper plates");
        }

    
}
