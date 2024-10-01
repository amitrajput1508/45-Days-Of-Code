import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RemoveBadElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt(); 
            int[] A = new int[N]; 
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt(); 
            }


            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : A) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

 
            int maxFrequency = 0;
            for (int freq : frequencyMap.values()) {
                if (freq > maxFrequency) {
                    maxFrequency = freq;
                }
            }

            int minRemovals = N - maxFrequency;
            System.out.println(minRemovals);
        }

        scanner.close();
    }
}