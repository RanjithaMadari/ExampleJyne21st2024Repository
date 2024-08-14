package com.overload.constructor;

class Productdemo
{
    Productdemo(String productname)

    {
        System.out.println("productname:"+productname);
    }

    Productdemo(int productId)
    {
        System.out.println("productId:"+productId);
    }
}

public class Product {
    public static void main(String[] args) {
        Productdemo p1=new Productdemo("productname Dell");
        Productdemo p2=new Productdemo( 1);

    }
}