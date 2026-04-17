package com.kunal.designpatterns.creational.abstractfactory;

import com.kunal.designpatterns.creational.abstractfactory.app.Application;
import com.kunal.designpatterns.creational.abstractfactory.factory.GUIFactory;
import com.kunal.designpatterns.creational.abstractfactory.factory.MacFactory;
import com.kunal.designpatterns.creational.abstractfactory.factory.WinFactory;

public class Main {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    private static Application applicationConfigurator() {
        Application app;
        GUIFactory factory;

        String osName= System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac"))
            factory= new MacFactory();
        else
            factory=new WinFactory();

        app= new Application(factory);

        return app;
    }

    public static void main(String[] args)
    {
        Application app=applicationConfigurator();
        app.paint();

    }


}
