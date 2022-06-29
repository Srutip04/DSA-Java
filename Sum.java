package com.company;

import java.util.*;

public class Sum {
    public int[] twoSum(int[] nums,int target){
        int[]ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;


                }

            }
        }
        return ans;
    }
    public Stack<Integer> repeat(int[] nums){
        Arrays.sort(nums);
        Stack<Integer>s=new Stack<>();
        int same=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
               if(same!=nums[i]){
                   s.push(nums[i]);
                   same=nums[i];

               }
            }
        }
        return s;
    }
    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : inputArray)
        {
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
    public static void main (String[] args){
        int[]nums={1,2,2,3,5,4,6,6,6,7};
        Sum s=new Sum();
        Stack<Integer>t=s.repeat(nums);
        while(!t.isEmpty()){
            System.out.println(t.pop());
        }
        findDuplicatesUsingHashMap(nums);

    }
}
