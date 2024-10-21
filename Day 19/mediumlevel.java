import java.util.*;

public class GroupAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }
            Map<Integer, Integer> groupCount = new HashMap<>();
            for (int p : P) {
                groupCount.put(p, groupCount.getOrDefault(p, 0) + 1);
            }
            boolean possible = true;
            for (int size : groupCount.keySet()) {
                if (groupCount.get(size) % size != 0) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}
