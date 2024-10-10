import java.util.HashMap;
import java.util.Scanner;

public class CardRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                frequencyMap.put(A[i], frequencyMap.getOrDefault(A[i], 0) + 1);
            }
            
            int maxFrequency = 0;
            for (int frequency : frequencyMap.values()) {
                maxFrequency = Math.max(maxFrequency, frequency);
            }
            
            System.out.println(N - maxFrequency);
        }
        
        sc.close();
    }
}
