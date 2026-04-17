package com.kunal.designpatterns.creational.abstractfactory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */

public class WinButton implements Button{

    public void paint(){

        System.out.println("Created a Windows Button");
    }

}
