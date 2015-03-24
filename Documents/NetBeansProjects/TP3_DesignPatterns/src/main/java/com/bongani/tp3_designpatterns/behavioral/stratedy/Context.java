/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.stratedy;

import com.bongani.tp3_designpatterns.behavioral.stratedy.Strategy;

/**
 *
 * @author Bongani klaas
 */
public class Context {
    
    int temperatureInF ;
    Strategy strategy ;
    public Context(int temperatureInF , Strategy strategy) {
    this .temperatureInF = temperatureInF ;
    this .strategy = strategy ;
    }
    public void setStrategy(Strategy strategy) {
    this .strategy = strategy ;
    }
    public int getTemperatureInF () {
    return temperatureInF ;
    }
    public boolean getResult() {
    return strategy .checkTemperature(temperatureInF);
    }

    
}
