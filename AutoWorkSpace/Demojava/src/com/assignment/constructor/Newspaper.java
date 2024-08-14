package com.assignment.constructor;

class News1{
    String newspaper;
    String magzine;
    String comics;
    int id;
    News1(String newspaper,String magzine, String comics,int id){
        newspaper=newspaper;
        magzine=magzine;
        comics=comics;
        id=id;
        System.out.println("newspaper:"+newspaper);
        System.out.println("magzine:"+magzine);
        System.out.println("comics:"+comics);
        System.out.println("id:"+id);
    }
}
public class Newspaper {
    public static void main(String[] args) {
     News1 n1=new News1("vijayavani","photography","superman",2);
    }
}
