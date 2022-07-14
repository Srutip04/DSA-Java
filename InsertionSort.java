package com.company;

public class InsertionSort {
    public static void sort(int[] n){

        for(int j=1;j<n.length;j++){
            int key=n[j];
            int i=j-1;
            while(i>0 && n[i]>key){
                n[i+1]=n[i];
                i=i-1;

            }

            n[i+1]=key;

        }
    }
    public static void main(String [] args){
        int []h={3,4,7,3,6,9};
        sort(h);
       for(int i=0;i<h.length;i++){
           System.out.println(h[i]);
       }
    }


}
