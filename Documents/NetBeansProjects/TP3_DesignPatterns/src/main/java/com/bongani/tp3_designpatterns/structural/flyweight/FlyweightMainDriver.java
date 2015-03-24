/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.structural.flyweight;

/**
 *
 * @author Mhumhu
 */
public class FlyweightMainDriver {
    public static void main(String[] args)
    {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        
        for(int i =0; i < 5; i++)
        {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            flyweightAdder.doMath(i, i);
            
            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            flyweightMultiplier.doMath(i, i);
            
        }
    }
    
}
