package com.sgtest.program;
class NationalPark{
    String location;
    String animals;
    int parkgate;

    NationalPark(){
        location="mysore";
        animals="lion";
        parkgate=1;
        System.out.println("location:"+location);
        System.out.println("animals:"+animals);
        System.out.println("parkgate:"+parkgate);
        System.out.println("+++++++++++++++");
    }
}
class Wonderla{
    String ride;
    int price;
    String place;


    Wonderla(){
        ride="roller coaster";
        price=2000;
        place="mumbai";
        System.out.println("ride:"+ride);
        System.out.println("price:"+price);
        System.out.println("place:"+place);
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        NationalPark obj=new NationalPark();
        Wonderla wl=new Wonderla();
    }
}
