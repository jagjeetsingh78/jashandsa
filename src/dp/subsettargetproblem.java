package dp;

public class subsettargetproblem {

    static void main() {
        int[] arr ={0,8,5,2,4};
        int tar =6;
          if(takeSum(0,arr,tar)){
              System.out.println("hurrah");
          }
          else{
              System.out.println("bad luck");
          }
    }

    public static boolean takeSum(int i, int[] arr , int target){
        if(i==arr.length) return (target==0);
        if(target==0) return true;
        boolean a = takeSum(i+1,arr,target-arr[i]);
        boolean b = takeSum(i+1,arr,target);
        return (a||b);
    }
}
