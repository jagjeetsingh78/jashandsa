import java.util.*;

class Solution {

    static void main() {

       
    }









    public int[] nextGreaterElement(int[] nums1, int[] nums2) {



        int[] result = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;

        st.push(nums1[0]);
        result[0] = -1;

        for (int i = n - 1; i > 0; i--) {
            while (!st.isEmpty() && nums1[i] <= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = -1;
                st.push(nums1[i]);
            } else {
                int num = checkindex(st.peek(), nums2);
                result[i] = num;
                st.push(nums1[i]);
            }
        }

        // reverse result array manually (Collections.reverse doesn't work on int[])
        for (int i = 0; i < n / 2; i++) {
            int temp = result[i];
            result[i] = result[n - i - 1];
            result[n - i - 1] = temp;
        }

        return result;
    }

    static int checkindex(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
