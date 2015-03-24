/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpattern_test.DesignPatters.singletonpattern;

/**
 *
 * @author Bongani klaas
 */
public class SingletonExample {
    private static SingletonExample singletonExample = null ;
private SingletonExample () {
}
public static SingletonExample getInstance () {
if (singletonExample == null) {
singletonExample = new SingletonExample () ;
}
return singletonExample ;
}
public void sayHello() {    
    System .out.println("Hello");
    }
}

   