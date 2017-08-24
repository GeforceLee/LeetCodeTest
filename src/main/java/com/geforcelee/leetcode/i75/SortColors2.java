package com.geforcelee.leetcode.i75;

public class SortColors2 {
    public static void sortColors(int[] nums) {

        //[0,lt] 0
        //[lt+1,i-1] = 1
        //[gt,length-1] = 2
        int lt = -1;
        int gt = nums.length;
        for (int i = 0; i < nums.length && gt >i; ) {
            int v = nums[i];
            if (v == 0) {
                int t = nums[lt+1];
                nums[lt + 1] = v;
                lt++;
                nums[i] = t;
                i++;
            } else if (v == 2) {
                int t = nums[gt - 1];
                nums[gt - 1] = v;
                nums[i]=t;
                gt--;
            } else {
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,0};
        sortColors(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
