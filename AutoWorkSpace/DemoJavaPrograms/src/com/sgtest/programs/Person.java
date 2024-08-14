package com.sgtest.programs;

public class Person {
     String firstname;
     int age;
     public static void main (String args[])
     {
         Person obj1=new Person();
         obj1.firstname="Ranjitha";
         obj1.age=23;
         System.out.println("firstName :"+obj1.firstname);
         System.out.println("age :"+obj1.age);
     }
}
