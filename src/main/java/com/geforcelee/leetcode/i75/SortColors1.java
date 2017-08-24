package com.geforcelee.leetcode.i75;

public class SortColors1 {
    public static void sortColors(int[] nums){
        int[] colors = new int[3];
        for (int i = 0; i < nums.length; i++) {
            colors[nums[i]]++;
        }
        int total=0;
        for (int i = 0; i < colors.length; i++) {
            int count = colors[i];
            for (int j = 0; j < count; j++) {
                nums[total++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0};
        sortColors(arr);
    }
}
