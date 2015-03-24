/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.adapterpattern;

import com.bongani.tp3_designpatterns.structural.adapterpattern.CelciusReporter;
import com.bongani.tp3_designpatterns.structural.adapterpattern.TemperatureInfo;

/**
 *
 * @author Bongani klaas
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo
{
        @Override
        public double getTemperatureInC () {
        return temperatureInC ;
        }
        @Override
        public double getTemperatureInF () {
        return cToF(temperatureInC);
        }
        @Override
        public void setTemperatureInC(double temperatureInC) {
        this .temperatureInC = temperatureInC ;
        }
        @Override
        public void setTemperatureInF(double temperatureInF) {
        this .temperatureInC = fToC(temperatureInF);
        }
        private double fToC(double f) {
        return ((f - 32) * 5 / 9);
        }
        private double cToF(double c) {
        return ((c * 9 / 5) + 32);
        }   
}
