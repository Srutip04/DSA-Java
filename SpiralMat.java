package com.company;

public class SpiralMat {
    public static void SpiralMat(int[][]mat){
        int num=0;
        int row_start=0,row_end=mat.length-1,col_start=0,col_end=mat[0].length-1;
        while(row_start<=row_end && col_start<=col_end){
            for(int col=col_start;col<=col_end;col++){
                mat[row_start][col]=num++;
            }
            row_start+=1;
            for(int j=row_start;j<=row_end;j++){
                mat[j][col_end]=num++;

            }
            col_end-=1;
            for(int col=col_end;col>=col_start;col--){
                mat[row_end][col]=num++;
            }
            row_end-=1;
            for(int j=row_end;j>=row_start;j--){
                mat[j][col_start]=num++;
            }
            col_start+=1;
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int [][]mat=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=0;
            }
        }
        SpiralMat(mat);
    }
}
