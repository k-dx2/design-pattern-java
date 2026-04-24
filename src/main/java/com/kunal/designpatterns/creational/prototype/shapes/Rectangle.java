package com.kunal.designpatterns.creational.prototype.shapes;


public class Rectangle extends Shape{
    public int length;
    public int width;

    public Rectangle()
    {
    }
    public Rectangle(Rectangle target)
    {
        super(target);
        this.length=target.length;
        this.width= target.width;
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public boolean equals(Object object)
    {
        if(!(object instanceof Rectangle))
                return false;

        Rectangle rectangle2=(Rectangle) object;
        return rectangle2.length==length&&rectangle2.width==width;

    }
}
