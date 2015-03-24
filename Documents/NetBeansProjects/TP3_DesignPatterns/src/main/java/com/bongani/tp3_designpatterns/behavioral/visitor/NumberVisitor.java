/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.visitor;

import java.util.List;

/**
 *
 * @author Bongani klaas
 */
public interface NumberVisitor {
    
public void visit(TwoElement twoElement);
public void visit(ThreeElement threeElement);
public void visit(List<NumberElement> elementList);

    
}
