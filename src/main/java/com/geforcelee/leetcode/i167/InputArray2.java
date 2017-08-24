package com.geforcelee.leetcode.i167;

public class InputArray2 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res =  new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            int toFind = target - a;
            int bIndex = subFind(numbers,toFind,i+1,numbers.length-1);
            if (bIndex>=0){
                res[0] = i+1;
                res[1] = bIndex+1;
                break;
            }
        }
        return res;
    }
    private static int subFind(int[] numbers,int target,int l,int r){
        if (l>r)
            return -1;
        int mid = (r-l)/2+l;
        int temp = numbers[mid];
        if (target == temp)
            return mid;
        if (target>temp){
            return subFind(numbers,target,mid+1,r);
        }else {
            return subFind(numbers,target,l,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997};
        int[] res = twoSum(numbers,542);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
