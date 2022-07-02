package com.company;

public class Kadane {
    public static void maxSum(int []n){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            curr+=n[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(max,curr);
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int []h={-1,4,-6,7,-4};
        maxSum(h);

    }
}
