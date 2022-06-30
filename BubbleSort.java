package com.company;

public class BubbleSort {
    public static void sort(int[]n){
        int h=n.length;
        for(int i=0;i<h-1;i++){
            for(int j=0;j<h-1;j++){
                if(n[j]>n[j+1]){
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }

            }
        }
        for(int i=0;i<h;i++){
            System.out.println(n[i]);
        }
    }
    public static void main(String[] args){
        int []h={3,6,5,8,12,9};
        sort(h);
    }
}
