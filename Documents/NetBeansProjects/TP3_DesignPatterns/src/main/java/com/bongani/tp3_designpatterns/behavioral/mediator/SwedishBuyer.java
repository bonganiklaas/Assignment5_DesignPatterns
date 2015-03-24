/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.mediator;

import com.bongani.tp3_designpatterns.behavioral.mediator.Buyer;
import com.bongani.tp3_designpatterns.behavioral.mediator.Mediator;

/**
 *
 * @author Bongani Klaas
 */
public class SwedishBuyer extends Buyer {
   
   public SwedishBuyer(Mediator mediator) {
super(mediator , "krona");
this.mediator.registerSwedishBuyer(this);
}

    
}
