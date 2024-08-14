package com.method.constructor;
class Number{
    void displayNumber(){
        for (int i = 200; i<=400; i++){
            if(i%2 == 0 || i%4 == 0 || i%6 == 0){
                System.out.println(i);
            }
        }
    }
}
public class DisplayCount {
    public static void main(String[] args) {
        Number n = new Number();
        n.displayNumber();
    }

}
