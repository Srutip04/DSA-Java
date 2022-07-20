package com.company;

public class knapsackwhole {

    public static int knapsack(int[]w,int[]v,int n,int maxW){
      //  int [][]T=new int[n+1][maxW+1];
      //  for(int i=1;i<n+1;i++){
         //   for(int j=1;j<maxW+1;j++){
          //      T[i][j]=Math.max(T[i-1][j],v[i-1]+T[i-1][j-maxW]);
         //   }
     //   }
     //   return T[n][maxW];
        if(n==0 ||maxW==0){
            return 0;
        }
        if(w[n-1]>maxW){
            return knapsack(w,v,n-1,maxW);
        }

        return Math.max( knapsack(w,v,n-1,maxW-w[n-1])+v[n-1],knapsack(w,v,n-1,maxW));
    }
    public static void main(String []args){
        int[]w={2,3,4,5};
        int []v={1,2,5,6};
        int n=4;
        int maxW=8;
        System.out.println(knapsack(w,v,n,maxW));
    }
}
