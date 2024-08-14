package com.sgtest.program;
abstract class  Shapes {
    abstract void area();
    {
        System.out.println("The formula for area of");
    }
}
class triangle extends Shapes
{
    void area()
    {
        System.out.println("Triangle is 1/2*base*height");
    }
}
class Circle extends Shapes
{
    void area()
    {
        System.out.println("Circle is 3.14*radius*radius");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Shapes myShape=null;
        Shapes myTriangle=new triangle();
        Shapes myCircle =new Circle();


        myTriangle.area();
        myCircle.area();

    }
}
