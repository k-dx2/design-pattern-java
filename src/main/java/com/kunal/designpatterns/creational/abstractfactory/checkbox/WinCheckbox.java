package com.kunal.designpatterns.creational.abstractfactory.checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */

public class WinCheckbox implements Checkbox{
    public void paint()
    {
        System.out.println("Created a Windows Checkbox");
    }
}
