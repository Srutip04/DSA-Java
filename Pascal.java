package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pascal {

    public List<List<Integer>> triangle(int rows){
        List<List<Integer>>l=new ArrayList<List<Integer>>();
        l.add(new ArrayList<>());
        l.get(0).add(1);
        for(int i=1;i<rows;i++){
            List<Integer>r=new ArrayList<>();
            List<Integer>prev=l.get(i-1);
            r.add(1);
            for(int j=1;j<i;j++){
                r.add(prev.get(j-1)+prev.get(j));

            }
            r.add(1);
            l.add(r);

        }
        return l;
    }

    public static void main(String []args){
        Pascal p=new Pascal();
        List<List<Integer>>list=
        p.triangle(5);
        System.out.println(list);
    }
}
