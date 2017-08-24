package com.geforcelee.leetcode.i283;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes2 {
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        //[0,k)为非0元素 [k,length)为0
        int k = 0;
        for (int i = 0; i < length; i++) {
            int t = nums[i];
            if (t != 0){
                nums[k++] = t;
            }
        }
        for (int i = k; i < length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{0,1,0,3,12};
        MoveZeroes2.moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
