import java.util.*;

public class LongestPalindromic {
    public static int lcs(String s1, String s2, int i, int j, int[][] memo) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            memo[i][j] = 1 + lcs(s1, s2, i - 1, j - 1, memo);
        }
        else {
            memo[i][j] = Math.max(lcs(s1, s2, i - 1, j, memo), lcs(s1, s2, i, j - 1, memo));
        }

        return memo[i][j];
    }

    public static int LongestPalindromicSubsequence(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int[][] memo = new int[n + 1][n + 1];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return lcs(s, rev, n, n, memo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(LongestPalindromicSubsequence(s));
        sc.close();
    }
}
