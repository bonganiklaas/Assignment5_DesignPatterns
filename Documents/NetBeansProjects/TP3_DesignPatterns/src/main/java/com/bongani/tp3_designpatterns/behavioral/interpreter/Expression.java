/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 *
 * @author Bongani Klaas
 */
public interface Expression {
    public int Interpret(Map<String,Expression> variables);
    
}
