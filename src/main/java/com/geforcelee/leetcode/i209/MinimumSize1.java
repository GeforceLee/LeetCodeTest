package com.geforcelee.leetcode.i209;

public class MinimumSize1 {
    public static int minSubArrayLen(int s, int[] nums) {
        int minLength = nums.length + 1;
        int sum = 0;
        int left = 0;
        int right;

        for (right = 0; right < nums.length; right++) {
            int t = nums[right];
            sum += t;
            while (sum>=s){
                sum-=nums[left];
                minLength = Math.min(minLength,right-left+1);
                left++;
            }

        }
        return minLength == nums.length + 1 ? 0 : minLength;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int res = minSubArrayLen(7, arr);
        System.out.println(res);
    }

}
