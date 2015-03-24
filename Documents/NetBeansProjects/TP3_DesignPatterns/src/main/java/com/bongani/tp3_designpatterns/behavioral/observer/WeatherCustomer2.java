/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.observer;

import com.bongani.tp3_designpatterns.behavioral.observer.WeatherObserver;

/**
 *
 * @author Bongani klaas
 */
public class WeatherCustomer2 implements WeatherObserver{

        @Override
    public void doUpdate(int temperature) {
    System .out.println("Weather customer 2 just found out the temperature is :" + temperature);
    }

    
}
