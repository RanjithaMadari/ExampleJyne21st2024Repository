package com.overload.constructor;

class Employee
{
    Employee(String Firstname)
    {
        System.out.println("Firstname:"+Firstname);
    }
    Employee(int EmployeeId)
    {
        System.out.println("EmployeeId:"+EmployeeId);
    }
}
public class Employeeoverload
{
    public static void main(String[] args)
    {
       Employee e1=new Employee("Ranjitha");
       Employee e2=new Employee(1);

    }
}
