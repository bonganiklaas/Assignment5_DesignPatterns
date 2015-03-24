/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.mediator;

import com.bongani.tp3_designpatterns.behavioral.mediator.Buyer;
import com.bongani.tp3_designpatterns.behavioral.mediator.Mediator;

/**
 *
 * @author bongani klaas
 */
public class FrenchBuyer extends Buyer{
    
  public FrenchBuyer(Mediator mediator) {
super(mediator , "euro");
this .mediator.registerFrenchBuyer(this);
}

    
}
