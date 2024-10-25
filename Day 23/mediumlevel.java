import java.util.Scanner;
import java.util.HashMap;

public class RemoveBadElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int element = scanner.nextInt();
                frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            }

            int maxFrequency = 0;
            for (int frequency : frequencyMap.values()) {
                maxFrequency = Math.max(maxFrequency, frequency);
            }

            System.out.println(N - maxFrequency);
        }

        scanner.close();
    }
}
