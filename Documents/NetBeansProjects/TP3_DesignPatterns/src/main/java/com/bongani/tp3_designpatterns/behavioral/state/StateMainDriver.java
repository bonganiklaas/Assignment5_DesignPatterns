/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.behavioral.state;

/**
 *
 * @author Mhumhu
 */
public class StateMainDriver {
    public static void main(String[] args)
    {
        Person person = new Person(new HappyState());
        System.out.println("Hello in happy state : " + person.sayHello());
        System.out.println("Goodbye in happy state : " + person.sayGoodbye());
        
        person.setEmotionalState(new SadState());
        System.out.println("Hello in sad state : " + person.sayHello());
        System.out.println("Goodbye in sad state : " + person.sayGoodbye());
        
    }
    
}
