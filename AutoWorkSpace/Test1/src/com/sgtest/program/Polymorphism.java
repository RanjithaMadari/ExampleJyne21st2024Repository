package com.sgtest.program;
abstract class  Animal {
    abstract void AnimalSound();
    {
        System.out.println("The Animal makes a Sound");
    }
}
class Pig extends Animal
{
 void AnimalSound()
 {
     System.out.println("The pig says:wee wee");
 }
}
class Dog extends Animal
{
    void AnimalSound()
    {
        System.out.println("The dog says:bow bow");
    }
}
class Cat extends Animal
{
    void AnimalSound()
    {
        System.out.println("The cat says:meow meow");
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
     Animal myanimal=null;
     Animal myPig=new Pig();
     Animal myDog=new Dog();
     Animal myCat=new Cat();


     myPig.AnimalSound();
     myDog.AnimalSound();
     myCat.AnimalSound();

    }

}
