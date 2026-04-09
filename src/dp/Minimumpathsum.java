package dp;

import java.util.Arrays;

public class Minimumpathsum {

    static void main(){
        int[][] arr ={{1,3,1},{1,5,1},{4,2,1}};
       int a =   minPathSum(arr);
       System.out.println(a);

    }



        public static int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            // the path sum to minimise the way is to be the
            int[][] dp = new int[m][n];
            for(int i=0;i<m;i++){
                Arrays.fill(dp[i],-1);
            }

            return path(0,0,m,n,dp,grid);




        }
    public static int path(int i, int j, int m, int n, int[][] dp, int[][] grid){

        if(i == m-1 && j == n-1) return grid[i][j];

        if(i >= m || j >= n) return Integer.MAX_VALUE;

        if(dp[i][j] != -1) return dp[i][j];

        int down = path(i+1, j, m, n, dp, grid);
        int right = path(i, j+1, m, n, dp, grid);

        dp[i][j] = grid[i][j] + Math.min(down, right);

        return dp[i][j];
    }
    }



