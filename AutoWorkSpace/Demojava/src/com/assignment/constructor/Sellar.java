package com.assignment.constructor;

class Sellar1{
    String wholeseller;
    String rentalsellar;
    int purchase;
    Sellar1(String wholeseller,String rentalsellar,int purchase)
    {
        wholeseller=wholeseller;
        rentalsellar=rentalsellar;
        purchase=purchase;
        System.out.println("wholeseller:"+wholeseller);
        System.out.println("rentalsallar:"+rentalsellar);
        System.out.println("purchase:"+purchase);
    }
}
public class Sellar {
    public static void main(String[] args) {
    Sellar1 s1=new Sellar1("dresses","lehenga",1);
    }
}