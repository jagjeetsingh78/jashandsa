package dp;

import java.util.Arrays;

public class subset_dp {

    public static void main(String[] args) {
        int[] arr = {0, 8, -1, 2, 4};
        int tar = 7;

        int[][] dp = new int[arr.length][tar + 1];

        // fill with -1 (means not calculated)
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        boolean ans = takeSum(0, arr, tar, dp);
        System.out.println(ans);
    }

    public static boolean takeSum(int i, int[] arr, int target, int[][] dp) {

        // base cases
        if (target == 0) return true;
        if (i == arr.length) return false;

        // check memo
        if (dp[i][target] != -1) {
            return dp[i][target] == 1;
        }

        boolean take = false;

        // ⚠️ only take if valid (avoid out of bound for positive target)
        if (target - arr[i] >= 0) {
            take = takeSum(i + 1, arr, target - arr[i], dp);
        }

        boolean notTake = takeSum(i + 1, arr, target, dp);

        boolean result = take || notTake;

        // store in dp
        dp[i][target] = result ? 1 : 0;

        return result;
    }
}