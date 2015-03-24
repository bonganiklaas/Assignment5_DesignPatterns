/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.structural.brigde;

/**
 *
 * @author Mhumhu
 */
public class BridgeMainDriver {
    public static void main(String[] args)
    {
        Vehicle vehicle = new BigBus( new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();
        
       vehicle = new SmallCar( new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive(); 
    }
    
}
