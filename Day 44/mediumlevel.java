import java.util.*;

public class CardSwipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] swipes = new int[N];
            for (int i = 0; i < N; i++) {
                swipes[i] = scanner.nextInt();
            }

            Set<Integer> office = new HashSet<>();
            int maxPeople = 0;

            for (int id : swipes) {
                if (office.contains(id)) {
                    office.remove(id);
                } else {
                    office.add(id);
                    maxPeople = Math.max(maxPeople, office.size());
                }
            }

            result.append(maxPeople).append("\n");
        }

        System.out.print(result);
        scanner.close();
    }
}
