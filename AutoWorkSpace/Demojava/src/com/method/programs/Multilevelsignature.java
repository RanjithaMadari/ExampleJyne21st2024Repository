package com.method.programs;
class  Person
{
    void ShowPersonname(String name)
    {
        System.out.println("ShowPersonname:"+name);
    }
}
class Employee1 extends Person
{
    Employee1(String name)
    {
        super.ShowPersonname(name);
    }
    void ShowPersonname(String name)
    {
        System.out.println("Employeename:" + name);
    }
}
public class Multilevelsignature
{
    public static void main(String[] args)
    {
      Employee1 o=new Employee1("Prashant");
      o.ShowPersonname("abhi");
    }
}
