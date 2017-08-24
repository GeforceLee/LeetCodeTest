package com.geforcelee.leetcode.i283;

public class MoveZeroes3 {
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        //[0,k)为非0元素 [k,length)为0

    }

    public static void main(String[] args) {

        int[] arr = new int[]{0,1,0,3,12};
        MoveZeroes3.moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
