package com.sgtest.program;
abstract class Smell {
    abstract void describe();
    {
        System.out.println("The is a generic smell");
    }
}
class flower extends Smell
{
    void describe()
    {
        System.out.println("This is a smell of flower");
    }
}
class Food extends Smell
{
    void describe()
    {
        System.out.println("This is a smell of food");
    }
}
class perfume extends Smell
{
    void describe()
    {
        System.out.println("This is a smell of perfume");
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {
        Smell smell;

        smell=new flower();
        smell.describe();

        smell=new Food();
        smell.describe();

        smell=new perfume();
        smell.describe();
    }
}
