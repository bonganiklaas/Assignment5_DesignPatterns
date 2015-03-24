/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.interpreter;

import com.bongani.tp3_designpatterns.behavioral.interpreter.Expression;
import java.util.Map;

/**
 *
 * @author bongani klaas
 */
public class Minus implements Expression{
    

    Expression leftOperand;
    Expression rightOperand;
    
    public Minus(Expression left, Expression right)
    {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int Interpret(Map<String, Expression> variables) {
        return leftOperand.Interpret(variables) - rightOperand.Interpret(variables);
    }
    
}
