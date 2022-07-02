package com.company;

public class MissNum {
    public static int missing(int []n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        int h=n.length;
        return h*(h+1)/2 - sum;
    }

    public static void main(String[] args){
        int[] h={3,0,1};
        System.out.println( missing(h));
    }
}
