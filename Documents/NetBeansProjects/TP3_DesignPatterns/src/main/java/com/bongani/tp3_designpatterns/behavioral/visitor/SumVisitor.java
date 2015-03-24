/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.visitor;

import com.bongani.tp3_designpatterns.behavioral.visitor.NumberElement;
import com.bongani.tp3_designpatterns.behavioral.visitor.NumberVisitor;
import java.util.List;


/**
 *
 * @author Bongani klaas
 */
public class SumVisitor implements NumberVisitor
{
    @Override
    public void visit(TwoElement twoElement) {
    int sum = twoElement .a + twoElement .b;
    System .out.println(twoElement .a + "+" + twoElement .b + "=" + sum);
    }
    @Override
    public void visit(ThreeElement threeElement) {
    int sum = threeElement .a + threeElement .b + threeElement .c;
    System .out.println(threeElement .a + "+" + threeElement .b + "+" + threeElement .c + "=" + sum);
    }
    @Override
    public void visit(List<NumberElement> elementList) {
    for (NumberElement ne : elementList) {
    ne.accept(this);

    }  
}
}
