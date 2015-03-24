/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.mediator;

import com.bongani.tp3_designpatterns.behavioral.mediator.Mediator;

/**
 *
 * @author bongani klaas
 */
public class AmericanSeller {
    
            Mediator mediator ;
        float priceInDollars ;
        public AmericanSeller(Mediator mediator , float priceInDollars) {
        this .mediator = mediator ;
        this .priceInDollars = priceInDollars ;
        this .mediator .registerAmericanSeller(this);
        }
        public boolean isBidAccepted(float bidInDollars) {
        if (bidInDollars>= priceInDollars) {
        System .out.println("Seller accepts the bid of " + bidInDollars + " dollars\n");
        return true;
        } else { System .out.println("Seller rejects the bid of " + bidInDollars + " dollars\n");
        return false ;
        }
        }

    
}
