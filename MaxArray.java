package com.company;

public class MaxArray {
    public int maxProduct(int[] nums) {

        if (nums.length == 0) return 0;

        int res = nums[0];

        for (int i = 0; i < nums.length; i++)
        {

            int product = 1;

            for (int j = i; j < nums.length; j++)
            {
                product *= nums[j];
                res = Math.max(res, product);
            }
        }
        return res;


    }
    public int maxSum(int []nums){
        //kadane improvised algo
        int ans=nums[0];
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
            ans=Math.max(nums[i],ans+nums[i]);
            res=Math.max(res,ans);
        }
        return res;
    }
    public static void main(String[] args){

        SubArray.MaxArray m=new SubArray.MaxArray();
        int[] h={1,6,3,4,5,8};
        System.out.println(m.maxSum(h));
        int []k={-1,2,5,7};
        System.out.println(m.maxProduct(k));

    }}
