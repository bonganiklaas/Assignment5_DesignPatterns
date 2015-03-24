/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.command;

import com.bongani.tp3_designpatterns.behavioral.command.Command;

/**
 *
 * @author bongani klaas
 */
public class MealInvoker {
    Command command ;

    public MealInvoker(Command command) {
    this.command = command ;
    }
    public void setCommand(Command command) {
    this.command = command ;
    }
    public void invoke() {
    command .execute() ;
    }

    
}
