import java.util.*;

public class Modulo11 {
    public static int findRemainder(String num) {
        int rem = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            rem = (rem * 10 + digit) % 11;
        }
        return rem;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String num = sc.nextLine();
        System.out.println(findRemainder(num));
        sc.close();
    }
}
