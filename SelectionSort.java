package com.company;

public class SelectionSort {
    public static void select(int[] n){

        for(int i=0;i<n.length;i++){
            int min=i;
            for(int j=i+1;j<n.length;j++){
                if(n[j]<n[min]){
                    min=j;
                }

            }
            int temp=n[min];
            n[min]=n[i];
            n[i]=temp;
        }
        for (int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }

    public static void main(String[] args){
        int[]h={4,7,2,9,0,1};
        select(h);
    }
}
