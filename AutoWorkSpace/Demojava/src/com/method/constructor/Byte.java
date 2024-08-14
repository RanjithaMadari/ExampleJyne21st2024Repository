package com.method.constructor;
class ArrayN{
    void displayByte(){
        byte[] ba = {1,2,4,5};
        int[] ia = new int[4];
        for (int i = 0; i< ba.length; i++){
            ia[i] = ba[i];
        }
        for (int i = 0; i< ia.length; i++){
            System.out.println(ia[i]);
        }
    }
}
public class Byte {
    public static void main(String[] args) {
        ArrayN a=new ArrayN();
        a.displayByte();
    }
}
