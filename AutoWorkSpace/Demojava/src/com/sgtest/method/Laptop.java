package com.sgtest.method;
class Price{
    int lap(int a){
        return a;
    }
}
public class Laptop {
    public static void main(String[] args) {
      Price o= new Price();
      int a=o.lap(5000);
        System.out.println(a);
    }
}
