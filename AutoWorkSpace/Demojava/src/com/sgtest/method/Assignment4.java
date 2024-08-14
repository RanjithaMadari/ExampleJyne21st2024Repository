package com.sgtest.method;
class country{
    String s="India";
    String DisplayCountry(){
        return s;
    }
}
public class Assignment4 {
    public static void main(String[] args) {
    country c=new country();
    String display=c.DisplayCountry();
    System.out.println(display);
    }
}
