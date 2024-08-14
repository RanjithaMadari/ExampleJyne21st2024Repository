package com.method.constructor;
class Even{
    void displayEven(){
        int  count = 0;
        for(int i=1;i<=500;i++){
            if(i%2 == 0){
                count = count + i;
            }
        }
        System.out.println("sum of even is:"+count);
    }
}
public class Count {
    public static void main(String[] args) {
        Even e=new Even();
        e.displayEven();
    }
}
