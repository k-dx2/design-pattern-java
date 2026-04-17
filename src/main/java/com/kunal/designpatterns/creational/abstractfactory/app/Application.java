package com.kunal.designpatterns.creational.abstractfactory.app;

import com.kunal.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.kunal.designpatterns.creational.abstractfactory.factory.GUIFactory;
import com.kunal.designpatterns.creational.abstractfactory.buttons.Button;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory)
    {
        this.button=factory.createButton();
        this.checkbox=factory.createCheckbox();
    }

    public void paint()
    {
        button.paint();
        checkbox.paint();
    }

}
