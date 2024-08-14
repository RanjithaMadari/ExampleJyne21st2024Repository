package com.sgtest.program;
abstract class Person {
    abstract void role();
    {
        System.out.println("The person has a role");
    }
}
class Employee extends Person
{
    void role()
    {
        System.out.println("the person is working as employee");
    }
}
class Father extends Person
{
    void role()
    {
        System.out.println("the person is caring as father");
    }
}
class Student extends Person
{
    void role()
    {
        System.out.println("the person is studying as student");
    }
}
public class Polymorphism3 {
    public static void main(String[] args) {
        Person person;

        person=new Employee();
        person.role();

        person=new Father();
        person.role();

        person=new Student();
        person.role();
    }
}
