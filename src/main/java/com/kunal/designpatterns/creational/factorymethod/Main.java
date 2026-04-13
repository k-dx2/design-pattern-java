package com.kunal.designpatterns.creational.factorymethod;

import com.kunal.designpatterns.creational.factorymethod.factory.Dialog;
import com.kunal.designpatterns.creational.factorymethod.factory.HTMLDialog;
import com.kunal.designpatterns.creational.factorymethod.factory.MacDialog;


public class Main {

    private static Dialog dialog;

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */

    public static void configure()
    {
        String os= System.getProperty("os.name").toLowerCase();

        if(os.contains("mac"))
        {
            dialog= new MacDialog();
        }
        else
        {
            dialog=new HTMLDialog();
        }
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

}
