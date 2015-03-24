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
public class SadState implements EmotionalState
{
    @Override
    public String sayGoodbye() {
    return "Bye. Sniff , sniff .";
    }
    @Override
    public String sayHello() {
    return "Hello. Sniff , sniff .";
    }


}
