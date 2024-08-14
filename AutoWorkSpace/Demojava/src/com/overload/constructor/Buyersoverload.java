package com.overload.constructor;

class Buyers
{
    Buyers(String buyersfirstname)
    {
        System.out.println("buyersfirstname:"+buyersfirstname);
    }
    Buyers(int buyersid)
    {
        System.out.println("buyersid:"+buyersid);
    }
}
public class Buyersoverload {
    public static void main(String[] args) {
     Buyers b1=new Buyers("raju");
     Buyers b2=new Buyers(3);
    }
}
