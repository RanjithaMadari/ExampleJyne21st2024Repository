package com.method.programs;
class Employee
{
    String Employeename;
    void show()
    {
        System.out.println("Employeename in super class:" + Employeename);
    }
}
 class Develpoer extends Employee
 {
     String name;
      Develpoer(String name)
      {
        super.Employeename=name;
      }
      void display()

      {
          System.out.println("name in subclass:"+name);
      }
 }
public class Multileveldatetype
{
    public static void main(String[] args)
    {
       Develpoer o=new Develpoer("Sneha");
      // o.("Prash");
       o.display();
       o.show();
    }
}
