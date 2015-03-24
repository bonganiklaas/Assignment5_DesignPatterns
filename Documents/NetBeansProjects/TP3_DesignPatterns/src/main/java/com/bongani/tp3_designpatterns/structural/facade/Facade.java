/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.structural.facade;

import com.bongani.tp3_designpatterns.structural.facade.Class1;
import com.bongani.tp3_designpatterns.structural.facade.Class2;
import com.bongani.tp3_designpatterns.structural.facade.Class3;

/**
 *
 * @author Bongani klaas
 */
public class Facade {
    
            public int cubeX(int x) {
        Class1 class1 = new Class1() ;
        return class1 .doSomethingComplicated(x);
        }
        public int cubeXTimes2(int x) {
        Class1 class1 = new Class1() ;
        Class2 class2 = new Class2() ;
        return class2 .doAnotherThing(class1 , x);
        }
        public int xToSixthPowerTimes2(int x) {
        Class1 class1 = new Class1() ;
        Class2 class2 = new Class2() ;
        Class3 class3 = new Class3() ;
        return class3 .doMoreStuff(class1 , class2 , x);
        }

    
}
