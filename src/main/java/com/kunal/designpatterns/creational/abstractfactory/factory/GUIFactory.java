package com.kunal.designpatterns.creational.abstractfactory.factory;

import com.kunal.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.kunal.designpatterns.creational.abstractfactory.buttons.Button;

public interface GUIFactory {

    public Button createButton();
    public Checkbox createCheckbox();

}
