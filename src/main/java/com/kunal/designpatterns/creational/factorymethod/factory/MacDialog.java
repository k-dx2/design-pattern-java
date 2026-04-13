package com.kunal.designpatterns.creational.factorymethod.factory;

import com.kunal.designpatterns.creational.factorymethod.buttons.Button;
import com.kunal.designpatterns.creational.factorymethod.buttons.MacButton;

/**
 * Mac Dialog will produce HTML buttons.
 */
public class MacDialog extends Dialog{

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
