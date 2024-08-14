package com.method.programs;

class  Maths10
{
    void Addition(int x,int y)
    {
        System.out.println("Addition result:"+(x+y));
    }
}
class Maths20 extends Maths10
{
    void Substraction(int a,int b)
    {
        System.out.println("substraction result:"+(a-b));
    }
}
class Maths30 extends Maths20
{
    void Multiplication(int x, int y)
    {
        System.out.println("mutlipliaction result:" + (x * y));
    }
}
public class Hierarchical {
    public static void main(String[] args) {
       Maths30 o=new Maths30();
       o.Addition(10,30);
       o.Substraction(100,50);
       o.Multiplication(25,5);

        Maths20 o1=new Maths20();
       o1.Substraction(200,50);
        o1.Substraction(100,50);
    }
}
