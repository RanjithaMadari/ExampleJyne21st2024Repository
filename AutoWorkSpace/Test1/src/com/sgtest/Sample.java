package com.sgtest;
class BasicMaths
{
    int getfactorial(int num)
{
  if(num==1)
  {
      return 1;
  }
  return num*getfactorial(num-1);
}
}
public class Sample {
    public static void main(String[] args) {
        BasicMaths obj=new BasicMaths();
        int v1=obj.getfactorial(5);
        System.out.println(v1);
    }
}
