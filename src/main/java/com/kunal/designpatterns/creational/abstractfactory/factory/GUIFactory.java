package com.kunal.designpatterns.creational.abstractfactory.factory;

import com.kunal.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.kunal.designpatterns.creational.abstractfactory.buttons.Button;

/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface GUIFactory {

    public Button createButton();
    public Checkbox createCheckbox();

}
