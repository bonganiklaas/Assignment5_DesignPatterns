/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.tp3_designpatterns.behavioral.memento;

/**
 *
 * @author Mhumhu
 */
public class MementoMainDriver {
    public static void main(String[] args)
    {
        DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();
        
        DietInfo dietInfo = new DietInfo("Fred", 1, 100);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumberAndWeight(2, 99);
        System.out.println(dietInfo);
        
        System.out.println("Saving state");
        dietInfoCaretaker.saveState(dietInfo);
        
        dietInfo.setDayNumberAndWeight(3, 98);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumberAndWeight(4, 97);
        System.out.println(dietInfo);
        
        System.out.println("Restoring saved state");
        dietInfoCaretaker.restoreState(dietInfo);
        System.out.println(dietInfo);
    }
}
