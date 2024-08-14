package com.operator.constructor;


class  Assigndemo
{
    String firstname;
    String name;
    int usn;
    Assigndemo (String firstname,String name ,int usn)
    {
        System.out.println("in constructor");
       this.firstname=firstname;
       this.name=name;
       this.usn=usn;
        System.out.println("firstname:"+firstname);
        System.out.println("name:"+name);
        System.out.println("usn:"+usn);
    }

    void display()
    {
        System.out.println("in method");
        System.out.println("firstname:"+firstname);
        System.out.println("name:"+name);
        System.out.println("usn:"+usn);
    }
        }

    public class Assign10{
       public static void main(String[] args) {
        Assigndemo B1=new Assigndemo("vtu","KLE",4566);
        B1.display();

    }
}

