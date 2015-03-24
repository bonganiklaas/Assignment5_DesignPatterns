/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.behavioral.observer;

/**
 *
 * @author Mhumhu
 */
public class ObserverMainDriver {
    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation(33);
        
        WeatherCustomer1 wc1 = new WeatherCustomer1();
        WeatherCustomer2 wc2 = new WeatherCustomer2();
        weatherStation.addObserver(wc1);
        weatherStation.addObserver(wc2);
        
        weatherStation.setTemperature(34);
        weatherStation.removeObserver(wc1);
        weatherStation.setTemperature(35);
    }
    
}
