package com.company;

public class Fibonacci {
    public static int fib(int n){
        //int z;
        if (n==1 ){
            //z=0;
            //System.out.println(z);
           return 0;
        }
        if(n==2){
            //z=1;
            //System.out.println(z);
           return 1;
        }
        else{
           return fib(n-1)+fib(n-2);
            //System.out.println(z);

        }

    }
    public static void main(String[] args){
        System.out.println(fib(1));
        System.out.println(fib(2));

        System.out.println(fib(3));

        System.out.println(fib(4));




    }

}
