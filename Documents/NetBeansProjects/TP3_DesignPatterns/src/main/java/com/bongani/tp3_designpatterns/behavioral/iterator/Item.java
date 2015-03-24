/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bongani.tp3_designpatterns.behavioral.iterator;

/**
 *
 * @author bongani klaas
 */
public class Item {
    
        String name ;
    float price ;
    public Item(String name , float price) {
    this .name = name ;
    this .price = price ;
    }
    public String toString() {
    return name + ": $" + price;
    }

    
}
