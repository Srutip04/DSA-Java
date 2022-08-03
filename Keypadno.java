package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Keypadno {

    public static int clickcount(String s){
        char []arr=s.toCharArray();

        HashMap<Character,Integer>key=new HashMap<>();
        int i=0;
        int total=0;
        for(int j=0;j<arr.length;j++){
            if(key.containsKey(arr[j])==true){
                total+=key.get(arr[j]);
            }
            else if(i<=8 && key.containsKey(arr[j])==false){
                i++;
                key.put(arr[j],1);
                total++;
            }
            else if(i<=17 && i>8 && key.containsKey(arr[j])==false){
                i++;
                key.put(arr[j],2);

                total+=2;

            }

            else if(i>17  && key.containsKey(arr[j])==false){
                i++;
                key.put(arr[j],3);
                total+=3;




            }


        }
        System.out.println(key);
        return total;


    }

    public static void main (String[] args){
        String s="abacdfejhghikj";
        System.out.println(clickcount(s));
    }
}
