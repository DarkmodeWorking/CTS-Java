import java.util.*;

public class CoinChange {
    public static int numberOfWays (int amount) {
        int[] coins = {1, 2, 5, 10};
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int c = 0; c < coins.length; c++) {
            for (int i = coins[c]; i <= amount; i++) {
                dp[i] = dp[i] + dp[i - coins[c]];
            }
        }
        return dp[amount];
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int amount = sc.nextInt();
        System.out.println(numberOfWays(amount));
        sc.close();
    }
}
