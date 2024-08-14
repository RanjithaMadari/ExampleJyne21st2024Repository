package com.sgtest.method;
class Favorite{
    String []getdishitem(){
        String s[]={"palav","idli","dosa"};
        return s;
    }
}
public class Dish {
    public static void main(String[] args) {
        Favorite f=new Favorite();
        String dishes[]=f.getdishitem();
        for(String val:dishes)
        {
            System.out.println(val);
        }

    }
}
