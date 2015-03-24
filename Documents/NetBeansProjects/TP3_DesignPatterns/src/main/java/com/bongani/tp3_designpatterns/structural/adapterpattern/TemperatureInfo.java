/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.adapterpattern;

/**
 *
 * @author Bongani klaas
 */
public interface TemperatureInfo {
    public double getTemperatureInF () ;
    public void setTemperatureInF(double temperatureInF);
    public double getTemperatureInC () ;
    public void setTemperatureInC(double temperatureInC);

    
}
