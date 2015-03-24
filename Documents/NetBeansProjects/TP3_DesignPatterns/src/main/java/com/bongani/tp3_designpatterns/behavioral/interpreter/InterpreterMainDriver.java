/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mhumhu
 */
public class InterpreterMainDriver {
    public static void main(String[] args)
    {
        String expression = " + _ W X Z";
         
         Evaluator sentence = new Evaluator(expression);
         
         Map<String,Expression> variables = new HashMap<String,Expression>();
         
         variables.put("W", new Numbers(5));
         variables.put("X", new Numbers(10));
         variables.put("Z", new Numbers(42));
         
         int results = sentence.Interpret(variables);
         
         System.out.println(results);
    }
    
}
