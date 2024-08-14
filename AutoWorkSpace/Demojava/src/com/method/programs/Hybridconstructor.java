package com.method.programs;
class Food
{
    String name;
    String Taste;
    Food(String name,String taste)
    {
        name=name;
        this.Taste=Taste;
        System.out.println("name:"+name);
        System.out.println("Teste:"+Taste);
    }

}
 class Address
    {
     String Locationname;
     Address(String name,String Taste,String Locationnmae)
     {
         super();
         this.Locationname=Locationnmae;
         System.out.println("locationname:"+Locationnmae);
     }
    }

public class Hybridconstructor
 {
    public static void main(String[] args)
    {
       Address o=new Address("dosa","yummy","RR nagar");
       Address o1= new Address("idli","teasty","Attigupe");
    }
 }
