/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.creational.prototypepattern;

/**
 *
 * @author Mhumhu
 */
public class PrototypeMainDriver {
    public static void main(String[] args)
    {
        Persons person1 = new Persons("Fred");
        System.out.println("person 1: " + person1);
        Persons person2 = (Persons) person1.doClone();
        System.out.println("person 2: " + person2);
        
        Dogs dog1 = new Dogs("Wooof");
        System.out.println("dog 1: " + dog1);
        Dogs dog2 = (Dogs) dog1.doClone();
        System.out.println("dog 2: " + dog2);
    }
    
}
