/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.structural.adapterpattern;

/**
 *
 * @author Mhumhu
 */
public class AdapterMainDriver {
    public static void main(String[] args)
    {
        //class adapter
        System.out.println("class adapter test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);
        
        //object adapter
        System.out.println("\nobject adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);
    }
    public static void testTempInfo(TemperatureInfo tempInfo)
    {
        tempInfo.setTemperatureInC(0);
        System.out.println("temp in C: " + tempInfo.getTemperatureInC());
        System.out.println("temp in F: " + tempInfo.getTemperatureInF());
         
        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C: " + tempInfo.getTemperatureInC());
        System.out.println("temp in F: " + tempInfo.getTemperatureInF());
         
    }
    
}
