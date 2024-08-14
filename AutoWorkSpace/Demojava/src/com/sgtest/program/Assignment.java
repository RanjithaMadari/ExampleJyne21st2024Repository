package com.sgtest.program;
 class Restaurant{
     String name;
     String location;
     int star;

     Restaurant(){
         name="Udupi";
         location="bengaluru";
         star=4;
         System.out.println("name:"+name);
         System.out.println("location:"+location);
         System.out.println("star:"+location);
         System.out.println("++++++++++++++");
     }
 }
 class FoodDelivery{
     String name;
     int phoneNumber;
     String company;
      FoodDelivery(){
          name="prashant";
          phoneNumber=86665757;
          company="zomato";
          System.out.println("name:"+name);
          System.out.println("phonenumber:"+phoneNumber);
          System.out.println("company:"+company);
      }
 }
 public class Assignment {
    public static void main(String[] args) {
        Restaurant obj=new Restaurant();
        FoodDelivery fd=new FoodDelivery();


    }
}
