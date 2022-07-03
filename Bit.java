package com.company;

public class Bit {

    public static boolean check2(int x){
        //whether 2 power or not
        return x!=0 && ((x&(x-1)) == 0);

    }
    public static int getBit(int n,int i){
        int k=1<<i;
        if((n & k)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setBit(int n,int i)
    {
        int k=1<<i;
        return n|k;
    }

    public static int clearBit(int n,int i){
        int k=1<<i;
        return n & ~(k);
    }

    public static int countOne(int n){
        int c=0;
        while(n!=0){
            n=n &(n-1);
            c++;
        }
        return c;
    }
    public static void generateSubset(char []arr){
        int n=arr.length;
        for(int i=0;i<(1<<n);i++){
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    System.out.print(arr[j]);
                }

            }
            System.out.println();
        }

    }
    public static int unique1(int[]arr){

        int xorsum=0;
        for(int i=0;i<arr.length;i++){
            xorsum=xorsum^arr[i];

        }
        return xorsum;
    }


    public static void main(String [] args){
        System.out.println(setBit(5,1));
        System.out.println(getBit(5,2));
        System.out.println(clearBit(5,2));
        System.out.println(countOne(5));
        char []arr={'a','b','c'};
        generateSubset(arr);
        System.out.println(check2(6));


    }
}
