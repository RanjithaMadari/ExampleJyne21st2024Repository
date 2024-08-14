package com.method.constructor;
class Elements{
    void printChar(){
        char[][] a ={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }

}
public class ArrayAssign {
    public static void main(String[] args) {
        Elements e=new Elements();
        e.printChar();
    }
}

