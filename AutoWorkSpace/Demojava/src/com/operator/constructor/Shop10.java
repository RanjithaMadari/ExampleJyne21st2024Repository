package com.operator.constructor;


    class Shopdemo {
        String shopname;
        String items;
        int distrubuteId;

        Shopdemo(String shopname, String items, int distrubuteId) {
            System.out.println("in constructor");
            this.shopname = shopname;
            this.items = items;
            this.distrubuteId = distrubuteId;
            System.out.println("shopname:" + shopname);
            System.out.println("items:" + items);
            System.out.println("distrubuteId:" + distrubuteId);
        }

        void display()
        {
            System.out.println("in method");
            System.out.println("shopname:" + shopname);
            System.out.println("items:" + items);
            System.out.println("distrubuteId:" + distrubuteId);
        }
    }


    public class Shop10
    {
        public static void main(String[] args) {
            Shopdemo a1=new Shopdemo("Surya","jaggery",8);
            a1.display();
        }
    }


