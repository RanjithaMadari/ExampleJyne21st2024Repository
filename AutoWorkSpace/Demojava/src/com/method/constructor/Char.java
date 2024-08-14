package com.method.constructor;
class Character{
    void printChar(){
        char[] c = {'p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

    }
}
public class Char {
    public static void main(String[] args) {
        Character c=new Character();
        c.printChar();

    }
}
