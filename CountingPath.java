package com.company;

public class CountingPath {

    public static int paths(int s,int e){
        int c=0;
        if(s==e){
            return 1;
        }
        if(s>e){
            return 0;
        }
        for(int i=0;i<=6;i++){
            c+=paths(s+i,e);
        }
        return c;
    }

    public static void main(String [] args){
        System.out.println(paths(0,3));
    }
}
