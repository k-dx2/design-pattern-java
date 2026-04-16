package com.kunal.designpatterns.creational.abstractfactory.factory;

import com.kunal.designpatterns.creational.abstractfactory.buttons.Button;
import com.kunal.designpatterns.creational.abstractfactory.buttons.MacButton;
import com.kunal.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.kunal.designpatterns.creational.abstractfactory.checkbox.MacCheckbox;

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
