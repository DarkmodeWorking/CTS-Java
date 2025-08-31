import java.util.*;

public class SiblingFinder {
    public static List<Integer> findSiblings(int[] arr, int x) {
        int n = arr.length;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            return Arrays.asList(-1);
        }
        if (idx == 0) {
            return Arrays.asList(-1);
        }
        int parent = (idx - 1) / 2;
        List<Integer> siblings = new ArrayList<>();
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;
        if (left < n && arr[left] != x) {
            siblings.add(arr[left]);
        }
        if (right < n && arr[right] != x) {
            siblings.add(arr[right]);
        }
        if (siblings.isEmpty()) {
            return Arrays.asList(-1);
        }
        Collections.sort(siblings);
        return siblings;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(findSiblings(arr, x));
        sc.close();
    }
}