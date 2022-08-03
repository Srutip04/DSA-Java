package com.company;

public class Backtrack {

    public static boolean isSafe(int[][]arr,int x,int y,int n){
        if(x<n && y<n && arr[x][y]==1){
            return true;

        }
        return false;
    }
    public static boolean ratinMaze(int [][]arr,int x,int y,int n,int[][]sol){
        if(x==n-1 && y==n-1 && arr[x][y]==1){
            sol[x][y]=1;
            return true;
        }


        if(isSafe(arr,x,y,n)==true){
            sol[x][y]=1;
            if(ratinMaze(arr,x+1,y,n,sol)){
                return true;
            }
            if(ratinMaze(arr,x,y+1,n,sol)){
                return true;
            }
            sol[x][y]=0;
            return false;

        }
        return false;
    }

    public static void main(String[]args){
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        int N = maze.length;
        int [][]sol=new int[N][N];
        ratinMaze(maze,0,0,N,sol);
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol[0].length;j++){
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }
}
