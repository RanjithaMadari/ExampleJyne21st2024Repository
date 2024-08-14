package com.overload.constructor;

class Supplier
{
    Supplier(String suppliername)
    {
        System.out.println("suppliername:"+suppliername);
    }
    Supplier(int supplierId)
    {
        System.out.println("suplierId:"+supplierId);
    }
}


public class Supplieroverload {
    public static void main(String[] args) {
        Buyers b1=new Buyers("prashant");
        Buyers b2=new Buyers(9);

    }
}
