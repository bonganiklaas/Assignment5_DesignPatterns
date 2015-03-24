/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.creational.singletonpattern;

/**
 *
 * @author Bongani klaas
 */
public class SingletonMainDriver {
    
    public static void main(String[] args)
    {
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.sayHello();
        
    }
    
}
