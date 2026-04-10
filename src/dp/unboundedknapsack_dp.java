package dp;

import java.util.Arrays;

public class unboundedknapsack_dp {


    public static void main(String[] args){
        int[] val ={6,3,9,8};
        int[] wt = {2,1,8,2};
        int cap =9;
        int m = maxCapacity(val,wt,cap);
        System.out.println(m);
    }




    public static  int maxCapacity(int[] price, int[] weight, int capacity) {
        int n = price.length;
        if (n != weight.length) return -1;

    int[][] dp = new int[n][capacity+1];
        for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
    }


        return solve(0, price, weight, capacity, n,dp);
}

public static int solve(int index, int[] price, int[] weight, int capacity, int n,int[][] dp ) {


    if (index == n || capacity == 0) return 0;
    if(dp[index][capacity]!=-1) return dp[index][capacity];
    int notTake = solve(index + 1, price, weight, capacity, n,dp);

    int take = 0;
    if (capacity >= weight[index]) {
        take = price[index] + solve(index , price, weight, capacity - weight[index], n,dp);
    }

    return  dp[index][capacity] =Math.max(take, notTake);
}
}
