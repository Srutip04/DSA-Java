package com.company;

public class Recursion {
    public boolean isAscending(int []array,int index){
        if( index <= 0 )
            return true;
        else if( array[index] <= array[index-1] )
            return false;
        else
            return isAscending( array, index - 1 );
    }
    public static void main(String []args){
        Recursion r=new Recursion();
        int []h={2,4,5,7,6};
        boolean p=r.isAscending(h,h.length-1);
        System.out.println(p);

    }
}
