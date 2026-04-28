package com.kunal.designpatterns.creational.singleton.naivemultithreaded;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value)
    {
        // The following code emulates slow initialization.
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }

        this.value=value;
    }

    public static Singleton getInstance(String value)
    {
        if(instance==null)
            return new Singleton(value);

        return instance;
    }
}
