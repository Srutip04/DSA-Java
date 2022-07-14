package com.company;

public class Tiling {
    public static int waystotile(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verplace=waystotile(n-m,m);
        int horplace=waystotile(n-1,m);
        return verplace+horplace;

    }
    public static void main(String args[]){
        System.out.println(waystotile(3,4));
    }
}
