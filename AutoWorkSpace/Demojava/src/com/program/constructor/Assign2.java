package com.program.constructor;

  class Maths1
  {
      Maths1 (int[][] x,int[][] y,int[][] z )
      {
          for(int i=0;i< x.length;i++)
          {
              for(int j=0;j<x[i].length;j++)
              {
                  for(int k=0;k<x[i].length;k++)

                  {
                  int res=x[i][j]+y[i][j];
                  System.out.println(res+" ");
              }
              System.out.println();

          }
          }
      }
  }
  public class Assign2 {
    public static void main(String[] args) {
        int[][] a={{1,2},{5,6}};
        int[][] b={{7,9},{6,7}};
        int[][] c={{7,8},{9,7}};
        Maths1 o1=new Maths1(a,b,c);
    }
}
