package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>l=new ArrayList<List<String>>();

        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[]c=strs[i].toCharArray();
            Arrays.sort(c);
            String t=new String(c);
            if(hm.containsKey(t)==true){
                ArrayList<String>rt=new ArrayList<String>(hm.get(t));
                rt.add(strs[i]);
                hm.put(t,rt);
            }
            else{
                ArrayList<String>rt=new ArrayList<String>();
                rt.add(strs[i]);
                hm.put(t,rt);
            }


        }
        for(String ss:hm.keySet()){
            l.add(hm.get(ss));


        }
        return l;

    }
}
