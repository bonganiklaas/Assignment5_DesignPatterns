/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.creational.builderpattern;

/**
 *
 * @author Bongani klaas
 */
public interface MealBuilder {
    public void buildDrink() ;
    public void buildMainCourse () ;
    public void buildSide() ;
    public Meal getMeal() ;
 }


