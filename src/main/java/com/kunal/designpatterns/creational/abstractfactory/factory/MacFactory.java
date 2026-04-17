package com.kunal.designpatterns.creational.abstractfactory.factory;

import com.kunal.designpatterns.creational.abstractfactory.buttons.Button;
import com.kunal.designpatterns.creational.abstractfactory.buttons.MacButton;
import com.kunal.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.kunal.designpatterns.creational.abstractfactory.checkbox.MacCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();

    }
}
