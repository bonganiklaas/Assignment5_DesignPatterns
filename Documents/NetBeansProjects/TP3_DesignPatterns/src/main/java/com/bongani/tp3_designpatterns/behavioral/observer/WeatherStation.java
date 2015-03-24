/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.observer;

import com.bongani.tp3_designpatterns.behavioral.observer.WeatherObserver;
import com.bongani.tp3_designpatterns.behavioral.observer.WeatherSubject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Bongani klaas
 */
public class WeatherStation implements WeatherSubject
{
            Set<WeatherObserver> weatherObservers ;
        int temperature ;
        public WeatherStation(int temperature) {
        weatherObservers = new HashSet<WeatherObserver>();
        this .temperature = temperature ;
        }
        @Override
        public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers .add(weatherObserver);
        }
        @Override
        public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers .remove(weatherObserver);
        }
        @Override
        public void doNotify() {
        Iterator<WeatherObserver> it = weatherObservers .iterator() ;
        while (it.hasNext()) {
        WeatherObserver weatherObserver = it.next() ;
        weatherObserver .doUpdate(temperature);
        }
        }
        public void setTemperature(int newTemperature) {
        System .out.println("\nWeather station setting temperature to " + newTemperature);
        temperature = newTemperature ;
        doNotify() ;
        }

}
