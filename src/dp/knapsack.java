package dp;

public class knapsack {

      public static void main(String[] args){
         int[] val ={5,3,9,8};
         int[] wt = {1,2,8,10};
         int cap =10;
         int m = maxCapacity(val,wt,cap);
         System.out.println(m);
     }

    public static  int maxCapacity(int[] price, int[] weight, int capacity) {
        int n = price.length;
        if (n != weight.length) return -1;

        return solve(0, price, weight, capacity, n);
    }

    public static int solve(int index, int[] price, int[] weight, int capacity, int n) {


        if (index == n || capacity == 0) return 0;

        int notTake = solve(index + 1, price, weight, capacity, n);

        int take = 0;
        if (capacity >= weight[index]) {
            take = price[index] + solve(index + 1, price, weight, capacity - weight[index], n);
        }

        return Math.max(take, notTake);
    }
}