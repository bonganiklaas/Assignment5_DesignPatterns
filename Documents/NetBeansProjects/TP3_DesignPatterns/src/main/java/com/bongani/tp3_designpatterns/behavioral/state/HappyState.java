/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.state;

import com.bongani.tp3_designpatterns.behavioral.state.EmotionalState;

/**
 *
 * @author Bongani klaas
 */
public class HappyState implements EmotionalState{
    
        @Override
    public String sayGoodbye() {
    return "Bye, friend !";
    }
    @Override
    public String sayHello() {
    return "Hello , friend !";
    }


}
