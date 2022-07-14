package com.company;

public class guests {
    public static int callway(int n){
        if(n<=1){
            return 1;
        }
        int single=callway(n-1);
        int pair=(n-1)*callway(n-2);
        return single+pair;
    }

  public static void main(String []args){
      System.out.println(callway(4));
  }
}
