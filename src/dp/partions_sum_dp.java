package dp;

import java.util.Arrays;

public class partions_sum_dp {



        public boolean canPartition(int[] nums) {
            int total = 0;
            for(int num : nums) total += num;

            if(total % 2 != 0) return false;
            int[][] dp = new int[nums.length][total/2+1];
            for(int i=0;i<nums.length;i++){
                Arrays.fill(dp[i],-1);
            }

            return dfs(nums, 0, total / 2,dp);
        }

        public boolean dfs(int[] nums, int i, int target,int[][] dp) {
            if(i == nums.length) return false;
            if(target == 0) return true;

            if(i >= nums.length || target < 0) return false;
            if(dp[i][target]!=-1){
                return dp[i][target]==1;
            }

            // take or not take
            boolean ans =(dfs(nums, i + 1, target - nums[i],dp) ||
                    dfs(nums, i + 1, target,dp));
            dp[i][target]=ans?1:0;
            return ans;
        }




}
