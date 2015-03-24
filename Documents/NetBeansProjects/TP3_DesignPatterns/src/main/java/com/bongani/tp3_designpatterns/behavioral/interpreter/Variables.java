/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 *
 * @author bongani klaas
 */
public class Variables implements Expression{
    
    private String name;
    
    public Variables(String name)
    {
        this.name = name;
    }

    @Override
    public int Interpret(Map<String, Expression> variables) {
        if(variables.get(name) == null)
            return 0;
        else 
            return variables.get(name).Interpret(variables);
    }
    
}
