/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.command;

import com.bongani.tp3_designpatterns.behavioral.command.Command;
import com.bongani.tp3_designpatterns.behavioral.command.Dinner;

/**
 *
 * @author bongani klaas
 */
public class DinnerCommand implements Command{
    
    Dinner dinner ;
    public DinnerCommand(Dinner dinner) {
    this .dinner = dinner ;
    }
    @Override
    public void execute() {
    dinner .makeDinner() ;
    }

    
}
