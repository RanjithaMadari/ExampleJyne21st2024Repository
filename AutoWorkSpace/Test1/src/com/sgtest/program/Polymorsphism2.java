package com.sgtest.program;

abstract class Fruit {
    abstract void taste();
    {
        System.out.println("Fruit tasting....");
    }
}
class Apple extends Fruit
{
    void taste()
    {
        System.out.println("Apple taste was sweet...");
    }
}
class Mango extends Fruit
{
    void taste()
    {
        System.out.println("Mango taste was Delicious...");
    }
}
class Orange extends Fruit
{
    void taste()
    {
        System.out.println("Orange taste was Juicey....");
    }
}

public class Polymorsphism2 {
    public static void main(String[] args) {
        Fruit fruit;

        fruit=new Apple();
        fruit.taste();

        fruit=new Mango();
        fruit.taste();

        fruit=new Orange();
        fruit.taste();

    }
}
