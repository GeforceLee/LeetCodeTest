package com.geforcelee.interview;

public class Shoot {
    public static int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[][] dp = new int[nums.length][nums.length];
        for (int len = 1; len <= nums.length; len++) {
            for (int start = 0; start <= nums.length - len; start++) {
                int end = start + len - 1;
                for (int i = start; i <= end; i++) {
                    int coins = nums[i] * getValue(nums, start - 1) * getValue(nums, end + 1);
                    coins += i != start ? dp[start][i - 1] : 0; // If not first one, we can add subrange on its left.
                    coins += i != end ? dp[i + 1][end] : 0; // If not last one, we can add subrange on its right
                    dp[start][end] = Math.max(dp[start][end], coins);
                    print(dp);
                }
                System.out.println("start 后移了 \n");

            }
            System.out.println("len 增加了\n");
        }
        return dp[0][nums.length - 1];
    }

    private static int getValue(int[] nums, int i) { // Deal with num[-1] and num[num.length]
        if (i < 0 || i >= nums.length) {
            return 1;
        }
        return nums[i];
    }

    private static void print(int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.printf("%3d ",dp[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,5,8};
        int score = maxCoins(arr);
        System.out.println(score);

        int[] arr1 = new int[]{2,3};
        int[] arr2 = new int[]{3};

        score = maxCoins(arr1);
        score += maxCoins(arr2);
        System.out.println(score);
    }
}
