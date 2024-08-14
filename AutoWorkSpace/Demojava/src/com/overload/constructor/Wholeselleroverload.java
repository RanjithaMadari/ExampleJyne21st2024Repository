package com.overload.constructor;

class wholesellardemo
{
    wholesellardemo(String firstname)
    {
        System.out.println("firstname:" + firstname);
    }
            wholesellardemo(int id)
            {
                System.out.println("id:"+id);
            }
}

public class Wholeselleroverload {
    public static void main(String[] args) {
        wholesellardemo w1=new wholesellardemo("HP");
        wholesellardemo w2=new wholesellardemo(7);

    }
}
