package com.kunal.designpatterns.creational.abstractfactory.checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */

public class MacCheckbox implements Checkbox{
    public void paint()
    {
        System.out.println("Created a MacOS Checkbox");
    }
}

