import java.util.*;

public class MaxBulbs {
    public static int maxBulbsCollected(int[] arr, int n) {
        int maxBulbs = 0;
        for (int i = 0; i < n; i++) {
            int minVal = arr[i];
            for(int j = i; j < n; j++) {
                minVal = Math.min(minVal, arr[j]);
                int bulbs = minVal * (j - i + 1);
                maxBulbs = Math.max(maxBulbs, bulbs);
            }
        }
        return maxBulbs;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxBulbsCollected(arr, n));
        sc.close();
    }
}

