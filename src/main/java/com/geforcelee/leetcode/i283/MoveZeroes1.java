package com.geforcelee.leetcode.i283;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes1 {
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            int t = nums[i];
            if (t != 0) {
                list.add(t);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i]= list.get(i);
        }
        for (int i = list.size(); i <length ; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{0,1,0,3,12};
        MoveZeroes1.moveZeroes(arr);
        System.out.println(arr);
    }
}
