/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.visitor;

/**
 *
 * @author Bongani klaas
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);

}
