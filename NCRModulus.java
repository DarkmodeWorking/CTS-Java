import java.util.*;

public class NCRModulus {
    public static long factorial (int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int m = sc.nextInt();
        long num = factorial(n);
        long den = factorial(r) * factorial(n - r);
        long result = num / den;
        result = result % m;
        System.out.println(result);
        sc.close(); 
    }
}
