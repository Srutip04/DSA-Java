package com.company;

public class ReshapeM {

    public static void matrixreshape(int[][]mat,int r,int c){
        int [][]a=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        int s=0,k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[s][k]=mat[i][j];
                k++;
                if(k==c){
                    k=0;
                    s++;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]);
            }
        }
    }
    public static void main(String []args){
        int[][] m={{1,2},{3,4}};
        matrixreshape(m,1,4);

    }
}
