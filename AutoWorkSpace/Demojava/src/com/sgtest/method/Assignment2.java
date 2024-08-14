package com.sgtest.method;
class Friend{
    String[] DisplayFriend(){
        String[] s={"Sushmitha","Ramya","Shivani","Monisha"};
        return s;
    }
}
public class Assignment2 {
    public static void main(String[] args) {
     Friend f=new Friend();
     String[]Display=f.DisplayFriend();
     for(String val:Display){
         System.out.println(val);
     }
    }
}
