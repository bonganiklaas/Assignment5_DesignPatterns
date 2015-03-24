/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 *
 * @author bongani klaas
 */
public class Evaluator implements Expression{
    
    private Expression syntaxTree;
    
    public Evaluator(String expression)
    {
        Stack<Expression> expressionStack = new Stack<Expression>();
        
        for(String token:expression.split(""))
        {
            if(token.equals("+"))
            {
                Expression subExpression = new Plus(expressionStack.pop(),expressionStack.pop());
                expressionStack.push(subExpression);
            }
            else if(token.equals("-"))
            {
                Expression right = expressionStack.pop();
                 Expression left = expressionStack.pop();
                 
                 Expression subExpression = new Minus(left,right);
                 expressionStack.push(subExpression);
            }
            else
            {
                expressionStack.push(new Variables(token));
            }
            
            syntaxTree = expressionStack.pop();
        }
    } 
    

    @Override
    public int Interpret(Map<String, Expression> variables) {
        return syntaxTree.Interpret(variables);
    }
    
}
