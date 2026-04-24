package com.kunal.designpatterns.creational.prototype.shapes;

public class Circle extends Shape{
    public int radius;

    public Circle()
    {


    }

    public Circle(Circle target)
    {
        super(target);
        this.radius=target.radius;

    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public boolean equals(Object object)
    {
        if(!(object instanceof Circle))
                return false;

        Circle circle2=(Circle) object;

        return circle2.radius==radius;

    }
}
