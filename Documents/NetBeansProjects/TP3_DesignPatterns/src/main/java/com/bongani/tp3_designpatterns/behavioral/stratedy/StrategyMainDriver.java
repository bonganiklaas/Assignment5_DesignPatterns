/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.behavioral.stratedy;

/**
 *
 * @author Mhumhu
 */
public class StrategyMainDriver {
    public static void main(String[] args)
    {
        int tempInf = 60;
        
        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(tempInf, skiStrategy);
        
        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? " + context.getResult());
        
        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);
        
        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? " + context.getResult());
        
    }
}
