/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.command;

import com.bongani.tp3_designpatterns.behavioral.command.Command;
import com.bongani.tp3_designpatterns.behavioral.command.Lunch;

/**
 *
 * @author bongani klaas
 */
public class LunchCommand implements Command
{
    Lunch lunch ;
    public LunchCommand(Lunch lunch) {
    this .lunch = lunch ;
    }
    @Override
    public void execute() {
    lunch .makeLunch() ;
    }

}
