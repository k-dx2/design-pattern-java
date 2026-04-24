package com.kunal.designpatterns.creational.prototype.shapes;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape()
    {

    }
    public Shape(Shape target)
    {
        this.x=target.x;
        this.y=target.y;
        this.color=target.color;
    }
    public abstract Shape clone();

    public boolean equal(Object object)
    {
        if(!(object instanceof Shape))
            return false;

        Shape shape2=(Shape)object;
        return shape2.x==x&&shape2.y==y&& Objects.equals(shape2.color,color);

    }


}
