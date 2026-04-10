package dp;
import java.util.*;

public class coinchange_dp {




        public int coinChange(int[] coins, int amount) {

            int[][] dp = new int[coins.length][amount + 1];

            for(int i = 0; i < coins.length; i++){
                Arrays.fill(dp[i], -1);
            }

            int ans = coins(coins, amount, 0, dp);

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }

        public int coins(int[] coins, int amount, int start, int[][] dp){

            if(amount == 0) return 0;
            if(start == coins.length) return Integer.MAX_VALUE;

            if(dp[start][amount] != -1) return dp[start][amount];

            int take = Integer.MAX_VALUE;

            if(coins[start] <= amount){
                int res = coins(coins, amount - coins[start], start, dp);
                if(res != Integer.MAX_VALUE){
                    take = 1 + res;
                }
            }

            int nottake = coins(coins, amount, start + 1, dp);

            return dp[start][amount] = Math.min(take, nottake);
        }

}
