package com.geforcelee.leetcode.i167;

public class InputArray {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res =  new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (i==j){
                    continue;
                }
                int b = numbers[j];
                if (a+b == target){

                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
                }
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
