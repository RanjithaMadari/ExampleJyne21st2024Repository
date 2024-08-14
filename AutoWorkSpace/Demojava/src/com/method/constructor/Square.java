package com.method.constructor;

class SumSquare{
    void sum1(){
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum = sum + (i*i);
        }
        System.out.println("sum of squares is:"+sum);
    }
}
public class Square {
    public static void main(String[] args) {
       SumSquare s= new SumSquare();
       s.sum1();
    }
}
