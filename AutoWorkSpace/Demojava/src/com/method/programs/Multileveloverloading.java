package com.method.programs;

import org.w3c.dom.ls.LSOutput;

class State
{
    void ShowStatename(String name)
    {
        System.out.println("ShowStatename:"+name);
    }
}
class City extends State
{
    City(String name)
    {
        super.ShowStatename(name);
    }
         void ShowStatename(String name)
         {
         System.out.println("Cityname:" + name);
     }
}
public class Multileveloverloading
{
    public static void main(String[] args)
    {
     City o=new City("Bengaluru");
     o.ShowStatename("Karnataka");
    }
}
