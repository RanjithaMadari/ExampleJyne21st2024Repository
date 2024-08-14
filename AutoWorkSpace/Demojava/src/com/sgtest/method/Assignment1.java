package com.sgtest.method;

class color{
    String[] DisplayColor(){
        String[] s={"Red","Blue","Orange","Green","Black","White","Brown"};
        return s;
    }
}
public class Assignment1 {
    public static void main(String[] args) {
     color c=new color();
     String[]Display=c.DisplayColor();
     for(String val:Display){
         System.out.println(val);
     }
    }
}
