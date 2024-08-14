package com.method.programs;
class Maths1
{
    void addition(int x,int y)
    {
        System.out.println("Addition result:"+(x+y));
    }
}
class Maths2 extends Maths1
{
void substraction(int a,int b)
{
    System.out.println("substarction result:"+(a-b));
}
}
class Maths3 extends Maths2
{
void Division (int a,int b)
{
    System.out.println("division result:"+(a/b));
}
}
class Maths4 extends Maths3
{
    void Mutliplication (int x,int y)
    {
        System.out.println("Multiplication result:"+(x*y));
    }
}
public class Multilevel{
    public static void main(String[] args) {
    Maths4 o=new Maths4();
    o.Mutliplication(5,3);
    o.Division(300,6);
    o.substraction(50,10);
    o.addition(40,30);
    }
}
