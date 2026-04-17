package com.kunal.designpatterns.creational.abstractfactory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */

public class MacButton implements Button{

    public void paint(){

        System.out.println("Created MacOS Button");
    }

}
