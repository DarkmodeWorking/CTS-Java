import java.util.*;

public class WordRotate {
    public static boolean remainsSameAfterRotation(String word, int n) {
        return word.length() != n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int n = sc.nextInt();
        String[] words = first.split(" ");
        int count = 0;

        for (String word : words) {
            if (remainsSameAfterRotation(word, n)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
