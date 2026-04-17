package com.kunal.designpatterns.creational.abstractfactory.factory;

import com.kunal.designpatterns.creational.abstractfactory.buttons.Button;
import com.kunal.designpatterns.creational.abstractfactory.buttons.WinButton;
import com.kunal.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.kunal.designpatterns.creational.abstractfactory.checkbox.WinCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();

    }
}
