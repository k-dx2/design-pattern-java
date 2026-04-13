package com.kunal.designpatterns.creational.factorymethod.factory;

import com.kunal.designpatterns.creational.factorymethod.buttons.Button;
import com.kunal.designpatterns.creational.factorymethod.buttons.HTMLButton;

public class HTMLDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
