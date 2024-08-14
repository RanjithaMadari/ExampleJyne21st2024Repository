package com.method.programs;

class  Maths01
{
    void Addition(int x,int y)
    {
        System.out.println("Addition result:"+(x+y));
    }
}
class Maths02 extends Maths01
{
   void Substraction(int a,int b)
    {
        System.out.println("substraction result:"+(a-b));
    }
}
class Maths03 extends Maths02 {
    void Multiplication(int x, int y) {
        System.out.println("mutlipliaction result:" + (x * y));
    }
}
public class Hybrid{
    public static void main(String[] args)
    {
        Maths03 o=new Maths03();
        o.Substraction(50,10);
        o.Addition(50,20);
        o.Multiplication(4,8);
        Maths02 o1=new Maths02();
        o1.Addition(8,9);;
        o1.Substraction(80,50);

    }
}
