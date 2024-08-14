package com.method.constructor;

class Array{
    void printRevere(){
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i==0;i++){
            for (int j=array[i].length-1; j>=0; j--){
                System.out.println(array[i][j]);
            }
        }
    }
}




public class Reverse {
    public static void main(String[] args) {
        Array a = new Array();
        a.printRevere();
    }
}
