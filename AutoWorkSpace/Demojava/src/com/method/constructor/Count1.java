package com.method.constructor;
class CountDemo {
    void DisplayCount() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count = count + i;
        }
        System.out.println("count[i]:"+count);
    }
}
public class Count1 {
    public static void main(String[] args) {
        CountDemo c=new CountDemo();
        c.DisplayCount();
    }
}
