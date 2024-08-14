package com.operator.constructor;

class Sellar1{
    String wholeseller;
    String rentalsellar;
    int purchase;
    Sellar1(String wholeseller,String rentalsellar,int purchase)
    {
        System.out.println("in constructor");
       this.wholeseller=wholeseller;
       this.rentalsellar=rentalsellar;
       this.purchase=purchase;
       System.out.println("wholeseller:"+wholeseller);
       System.out.println("rentalsallar:"+rentalsellar);
       System.out.println("purchase:"+purchase);
    }
    void display()
    {
        System.out.println("in method");
        System.out.println("wholeseller:"+wholeseller);
        System.out.println("rentalsallar:"+rentalsellar);
        System.out.println("purchase:"+purchase);
    }

}
public class Sellar10 {
    public static void main(String[] args) {
        Sellar1 s1=new Sellar1("sarres","blouse",4);
        s1.display();
    }
}
