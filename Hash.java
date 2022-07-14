package com.company;

import java.util.HashMap;

public class Hash {
    public static int countSubarraysWithSumK(int[] a, int K) {
        int n=a.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==K){
                count++;
            }
            if(h.get(sum-K)!=null){
                count+=h.get(sum-K);
            }
            if(h.get(sum)!=null){
                h.put(sum,h.get(sum)+1);
            }else{
                h.put(sum,1);
            }
        }
        return count;


    }
    public static void main(String[] args){
        int []h={1,2,3};
        int k=3;
        System.out.println(countSubarraysWithSumK(h,k));

    }

}
