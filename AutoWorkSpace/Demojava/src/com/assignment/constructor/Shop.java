package com.assignment.constructor;

class Shopdemo {
    String shopname;
    String items;
    int distrubuteId;
    Shopdemo(String shopname,String items,int distrubuteId)
    {
        shopname=shopname;
        items=items;
        distrubuteId=distrubuteId;
        System.out.println("shopname:"+shopname);
        System.out.println("items:"+items);
        System.out.println("distrubuteId:"+distrubuteId);
    }
}

    class Shopdemo1 {
        String sname;
        String iname;
        int dId;

        Shopdemo1(String sname, String iname, int dId)
        {
            sname=sname;
            iname=iname;
            dId=dId;
            System.out.println("sname:"+sname);
            System.out.println("iname:"+iname);
            System.out.println("dId:"+dId);
        }
        }



public class Shop
{
    public static void main(String[] args) {
        Shopdemo obj=new Shopdemo("Prashanth","ragi",1);
        Shopdemo1 obj1=new Shopdemo1("Raj","jeera",2);
    }
}

