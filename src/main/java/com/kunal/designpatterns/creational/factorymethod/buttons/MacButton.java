package com.kunal.designpatterns.creational.factorymethod.buttons;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Mac Test Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! - Mac Button says 'Hello World!'");
    }
}
