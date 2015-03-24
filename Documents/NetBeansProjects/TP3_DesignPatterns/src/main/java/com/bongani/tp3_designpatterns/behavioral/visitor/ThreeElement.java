/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.visitor;

/**
 *
 * @author Bongani klaas
 */
public class ThreeElement implements NumberElement
{
    int a;
    int b;
    int c;
    public ThreeElement(int a, int b, int c) {
    this .a = a;
    this .b = b;
    this .c = c;
    }
    @Override
    public void accept(NumberVisitor visitor) {
    visitor.visit(this);
    }
    
}


