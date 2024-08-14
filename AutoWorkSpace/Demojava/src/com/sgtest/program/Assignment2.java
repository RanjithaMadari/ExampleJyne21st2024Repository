package com.sgtest.program;
class Animals{
    String animalname;
    int numberoflegs;

    Animals(){
        animalname="tiger";
        numberoflegs=4;
        System.out.println("animalname:"+animalname);
        System.out.println("numberoflegs:"+numberoflegs);
        System.out.println("++++++++++++");
    }
}
class AquaticAnimals{
    String Aquaticanimalname;
    String color;
    int age;

    AquaticAnimals(){
        Aquaticanimalname="GoldFish";
        color="goldencolor";
        age=15;
        System.out.println("Acquaticanimalname:"+Aquaticanimalname);
        System.out.println("color:"+color);
        System.out.println("age:"+age);

    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Animals obj=new Animals();
        AquaticAnimals AA=new AquaticAnimals();
    }
}



