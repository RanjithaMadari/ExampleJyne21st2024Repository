package com.sgtest.method;
class evenNumber {
    int[] DisplayEvenNumber() {
        int[] arr = new int[10];
        int index = 0;
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        evenNumber e=new evenNumber();
        int[] display=e.DisplayEvenNumber();
        for(int val:display){
            System.out.println(val);
        }
    }
}
