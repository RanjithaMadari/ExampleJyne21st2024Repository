package com.program.constructor;
class Maths {
    Maths(int[][] x, int[][] y)
    {
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                int res=x[i][j]+y[i][j];
                System.out.println(res+" ");
            }
            System.out.println();
        }
    }
}
public class TwoMatrix {
    public static void main(String[] args) {
        int[][] a={{120},{50}};
        int[][] b={{50},{20}};
        Maths o1=new Maths(a,b);

    }

}
