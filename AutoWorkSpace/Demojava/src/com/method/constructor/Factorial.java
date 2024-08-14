package com.method.constructor;

class NewFactorial{
    void printFactorial(int num){
        int fact =1;
        for (int i =1;i<=5; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is "+fact);

    }
}

public class Factorial {
    public static void main(String[] args) {
        NewFactorial f = new NewFactorial();
        f.printFactorial(5);
    }
}
