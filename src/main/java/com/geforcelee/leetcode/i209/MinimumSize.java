package com.geforcelee.leetcode.i209;

public class MinimumSize {
    public static int minSubArrayLen(int s, int[] nums) {
        int minLength = nums.length+1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int length =0;
            for (int j = i; j < nums.length; j++) {
                int t = nums[j];
                sum += t;
                length++;
                if (sum>=s){
                    minLength =  Math.min(length,minLength);
                    break;
                }
            }
        }
        return minLength==nums.length+1? 0 : minLength;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int res = minSubArrayLen(7,arr);
        System.out.println(res);
    }

}
