package dp;

import java.util.Arrays;

public class houserobber {


        public int rob(int[] nums) {
            int n =nums.length;
            int[] dp = new int[n];
            Arrays.fill(dp,-1);
            dp[0]=nums[0];
            dp[1]=nums[1];

            return Math.max(ans(n-1,dp,nums),ans(n-2,dp,nums));



        }

        public int ans(int idx, int[] dp,int[] nums){
            if(dp[idx]!=-1) return dp[idx];
            return dp[idx]= nums[idx]+Math.max(ans(idx-3,dp,nums),ans(idx-2,dp,nums));

        }

}
