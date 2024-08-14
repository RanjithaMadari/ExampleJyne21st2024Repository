package com.method.constructor;
class integer{
    void DisplayInteger(){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
public class IntegerTwoDArray {
    public static void main(String[] args) {
        integer o=new integer();
        o.DisplayInteger();
    }
}
