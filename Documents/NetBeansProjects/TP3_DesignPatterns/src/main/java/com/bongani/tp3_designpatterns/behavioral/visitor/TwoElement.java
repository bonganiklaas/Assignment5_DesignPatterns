/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.visitor;

import com.bongani.tp3_designpatterns.behavioral.visitor.NumberElement;
import com.bongani.tp3_designpatterns.behavioral.visitor.NumberVisitor;

/**
 *
 * @author Bongani klaas
 */
public class TwoElement implements NumberElement
  {
    int a;
    int b;
    public TwoElement(int a, int b) {
    this .a = a;
    this .b = b;
    }
    @Override
    public void accept(NumberVisitor visitor) {
    visitor .visit(this);
    }
    
}
