import java.util.*;

public class Derangement {
    public static long derangement (int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return (n - 1) * (derangement(n - 1) + derangement(n - 2));
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long result = derangement(n);
        System.out.println(result);
        sc.close();
    }
}
