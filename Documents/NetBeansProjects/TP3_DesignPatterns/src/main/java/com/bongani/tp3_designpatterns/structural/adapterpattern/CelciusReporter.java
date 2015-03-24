/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.adapterpattern;

/**
 *
 * @author Bongani klaas
 */
public class CelciusReporter {
    
    public double temperatureInC ;
    public CelciusReporter () {
    }
    public double getTemperature () {
    return temperatureInC ;
    }
    public void setTemperature(double temperatureInC) {
    this .temperatureInC = temperatureInC ;
    }

}
