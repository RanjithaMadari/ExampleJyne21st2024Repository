package com.method.constructor;
class Table1{
    void displayTable(){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 1; i<=20; i++){
            for(int j = 0; j<a.length; j++){
                System.out.println(i*a[j]);
            }
            System.out.println("++++++++++++++++");
        }

    }
}




public class Tables {
    public static void main(String[] args) {
        Table1 t = new Table1();
        t.displayTable();
    }
}
