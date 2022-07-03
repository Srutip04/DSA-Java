package com.company;

public class seiveOfer {

    public static void primes(int n){
        int[]arr=new int[100];
        for(int i=0;i<100;i++){
            arr[i]=0;

        }
        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=1;
                }
            }


        }

        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                System.out.print(i+" ");
            }
        }}
    public static void factor(int n){
            int spf[]=new int[100];
            for(int i=2;i<=n;i++){
                spf[i]=i;
            }
            for(int i=2;i<=n;i++){
                if(spf[i]==i){
                    for(int j=i*i;j<=n;j+=1){
                        if(spf[j]==j){
                            spf[j]=i;
                        }
                    }
                }
            }

            while(n!=1){
                System.out.println(spf[n]);
                n=n/spf[n];
            }

        }
    public static void main(String [] args){
        primes(30);
        factor(30);



    }
}
