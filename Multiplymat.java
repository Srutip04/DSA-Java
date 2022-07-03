package com.company;

public class Multiplymat {

    public static void mulMat(int[][]m1,int [][]m2){
        int k=m1.length;
        int m=m1[0].length;
        int s=m2[0].length;
       //for matrix search start from top right corner if given in sorted order
        int [][]mul=new int[k][s];



        for(int i=0;i<k;i++)
        {
            for(int j=0;j<s;j++){
                for(int d=0;d<m;d++){
                        mul[i][j]+=m1[i][d]*m2[d][j];
                    }
            }
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<s;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main (String [] args){
        int mat1[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        int mat2[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        mulMat(mat1,mat2);

    }
}
