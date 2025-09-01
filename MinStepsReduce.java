import java.util.*;

public class MinStepsReduce {
    public static int minOperations(int[] nums, int x) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        int target = total - x;
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return nums.length;
        }
        int n = nums.length;
        int maxLen = -1, currSum = 0, left = 0;
        for (int right = 0; right < n; right++) {
            currSum = currSum + nums[right];
            while (currSum > target && left <= right) {
                currSum = currSum - nums[left];
                left++;
            }
            if (currSum == target) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        if (maxLen == -1) {
            return -1;
        }
        return n - maxLen;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(minOperations(arr, x));
        sc.close();
    }
}
