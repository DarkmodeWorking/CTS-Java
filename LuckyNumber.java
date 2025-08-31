import java.util.*;

public class LuckyNumber {
    public static int findLuckyNumber (int n, int m, int[] arr) {
        int[][] matrix = new int[n][m];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = arr[idx];
                idx++;
            }
        }
        int maxRowSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            maxRowSum = Math.max(maxRowSum, rowSum);
        }
        int maxColSum = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum = colSum + matrix[i][j];
            }
            maxColSum = Math.max(maxColSum, colSum);
        }
        return maxRowSum + maxColSum;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n * m];
        for (int i = 0; i < n * m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findLuckyNumber(n, m, arr));
        sc.close();
    }
}
