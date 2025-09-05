import java.util.*;

public class LongestPalindromic {
   public static int lps(String s, int i, int j) {
    if (i > j) return 0;
    if (i == j) return 1;

    if (s.charAt(i) == s.charAt(j)) {
        return 2 + lps(s, i+1, j-1);
    } else {
        return Math.max(lps(s, i+1, j), lps(s, i, j-1));
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(LongestPalindromicSubsequence(s));
        sc.close();
    }
}
