package com.sgtest.method;
class Collage{
    String[]DisplayCollage(){
        String[] s={"Dayananada Sagar University","PES"};
        return s;
    }
}
public class Assignment0 {
    public static void main(String[] args) {
      Collage c=new Collage();
      String display[]=c.DisplayCollage();
      for(String val:display){
          System.out.println(val);
      }
    }
}
