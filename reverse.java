package com.company;

public class reverse {
    public static int rev(int a){
        int t=0;

        while(a>0){
            int r=a%10;//get last digit
            t=t*10+r;
            a=a/10;

        }
        return t;
    }
    public static void main(String[] args){
        System.out.println(rev(34567));
    }
}
