package com.kunal.designpatterns.creational.factorymethod.buttons;

/**
 * HTML button implementation.
 */
public class HTMLButton implements Button{

    @Override
    public void render() {
        System.out.println("Test HTML Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! - HTML Button says 'Hello World!'");
    }
}
