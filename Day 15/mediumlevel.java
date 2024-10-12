import java.util.Scanner;
import java.util.HashMap;

public class PetStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int animal = sc.nextInt();
                frequencyMap.put(animal, frequencyMap.getOrDefault(animal, 0) + 1);
            }

            boolean possible = true;
            for (int count : frequencyMap.values()) {
                if (count % 2 != 0) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
