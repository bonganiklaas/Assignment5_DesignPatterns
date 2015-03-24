/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.creational.prototypepattern;

/**
 *
 * @author Bongani klaas
 */
public class Dogs implements Prototype{
            String sound ;
        public Dogs(String sound) {
        this .sound = sound ;
        }
        @Override
        public Prototype doClone() {
        return new Dogs(sound);
        }
        public String toString() {
        return "This dog says " + sound ;
        }

}
