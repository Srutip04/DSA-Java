package com.company;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.lang.Integer;

// Class 1 
// A class to represent a student. 
class fracKnapsack{
    int weight;
    int value;
    double cost;


    // Constructor 
    public fracKnapsack(int weight, int value)
    {
        // This keyword refers to current object itself 
        this.weight=weight;
        this.value=value;
        this.cost= ((double)value/(double)weight);
    }

    public static double knap(fracKnapsack[] f,int W,int n){
        Arrays.sort(f, new Comparator<fracKnapsack>() {
            @Override
            public int compare(fracKnapsack o1, fracKnapsack o2) {
                Integer x1= (int) (o1.cost);
                Integer x2= (int) (o2.cost);
                return x1.compareTo(x2);

            }
        });

        double totalValue = 0d;

        for (int j=n-1;j>=0;j--) {
            fracKnapsack i=f[j];

            int curWt = (int)i.weight;
            int curVal = (int)i.value;

            if (W - curWt >= 0) {
                // this weight can be picked while
                W = W - curWt;
                totalValue += curVal;
            }
            else {
                // item cant be picked whole
                double fraction
                        = ((double)W / (double)curWt);
                totalValue += (curVal * fraction);
                W = (int)(W - (curWt * fraction));
                break;
            }
        }

        return totalValue;}

    public static void main(String[] args){
        fracKnapsack[]f=new fracKnapsack[4];

        f[0]= new fracKnapsack(10,60);
        f[1]=new fracKnapsack(40,40);
        f[2]=new fracKnapsack(20,100);
        f[3]=new fracKnapsack(30,120);
        System.out.println(knap(f,50,4));




    }

}

