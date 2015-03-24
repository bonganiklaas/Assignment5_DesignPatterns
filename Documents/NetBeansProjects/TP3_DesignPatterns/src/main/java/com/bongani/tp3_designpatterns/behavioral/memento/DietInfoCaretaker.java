/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.memento;

/**
 *
 * @author Bongani klaas
 */
public class DietInfoCaretaker {
    
    Object objMemento ;
public void saveState(DietInfo dietInfo) {
objMemento = dietInfo .save() ;
}
public void restoreState(DietInfo dietInfo) {
dietInfo .restore(objMemento);
}

    
}
