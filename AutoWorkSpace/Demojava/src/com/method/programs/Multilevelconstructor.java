package com.method.programs;
class Student
{
    String firstname;
    String studentfavsub;
    Student(String firstname,String studentfavsub)
    {
        firstname = firstname;
        this.studentfavsub=studentfavsub;
        System.out.println("firstname:"+firstname);
        System.out.println("studentfavsub:"+studentfavsub);
    }
}
 class Teacher extends Student
 {
   String firstname;
   String Tecaherfavstudent;
   Teacher(String firstname,String Teacherfavstudent)
   {
     super(firstname,Teacherfavstudent);
   }

 }
 public class Multilevelconstructor
 {
    public static void main(String[] args)
    {
      Teacher o=new Teacher("Esha","sneha");
      Teacher o1=new Teacher("prashanth","Ranjitha");
    }
}
