package com.operator.constructor;

class News1{
    String newspaper;
    String magzine;
    String comics;
    int id;
    News1(String newspaper,String magzine, String comics,int id){
        System.out.println("in constructor");
       this.newspaper=newspaper;
       this.magzine=magzine;
       this.comics=comics;
       this.id=id;
        System.out.println("newspaper:"+newspaper);
        System.out.println("magzine:"+magzine);
        System.out.println("comics:"+comics);
        System.out.println("id:"+id);
    }
    void display()
    {
        System.out.println("in method");
        System.out.println("newspaper:"+newspaper);
        System.out.println("magzine:"+magzine);
        System.out.println("comics:"+comics);
        System.out.println("id:"+id);

    }
}
public class Newspaper10 {
    public static void main(String[] args) {
        News1 c1=new News1("kannadaprabha","birds","spiderman",6);
        c1.display();
    }
}
