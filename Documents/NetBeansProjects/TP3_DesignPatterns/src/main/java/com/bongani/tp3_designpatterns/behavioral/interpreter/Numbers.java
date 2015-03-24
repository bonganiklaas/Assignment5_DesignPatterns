/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.interpreter;

import com.bongani.tp3_designpatterns.behavioral.interpreter.Expression;
import java.util.Map;

/**
 *
 * @author bogani klaas
 */
public class Numbers implements Expression{
    private int number;
    
    public Numbers(int number)
    {
        this.number = number;
    }

    @Override
    public int Interpret(Map<String, Expression> variables) {
        return number;
    }
    
}
