package com.geforcelee.leetcode.i167;

public class InputArray1 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res =  new int[2];
        int i=0;
        int j=numbers.length-1;
        while (i<j){
            int a = numbers[i];
            int b = numbers[j];
            if (a+b == target){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }else if (a+b <target){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] res = twoSum(numbers,9);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
