package arrays;
import  java.util.*;

public class multiplicationof2darrays {



        public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {

            // Check if multiplication is possible
            if (mat1[0].length != mat2.length) {
                return null;
            }

            int n = mat1.length;
            int m = mat2[0].length;
            int k = mat1[0].length;

            int[][] mat3 = new int[n][m];

            // Matrix multiplication
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int x = 0; x < k; x++) {
                        mat3[i][j] += mat1[i][x] * mat2[x][j];
                    }
                }
            }

            // Convert to ArrayList<ArrayList<Integer>>
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    row.add(mat3[i][j]);
                }
                result.add(row);
            }

            return result;

    }
}
