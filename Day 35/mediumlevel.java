import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LaptopRecommendation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] recommendations = new int[11];

            for (int i = 0; i < N; i++) {
                int laptop = scanner.nextInt();
                recommendations[laptop]++;
            }

            int maxCount = 0;
            int laptopToBuy = -1;
            boolean isConfused = false;

            for (int i = 1; i <= 10; i++) {
                if (recommendations[i] > maxCount) {
                    maxCount = recommendations[i];
                    laptopToBuy = i;
                    isConfused = false;
                } else if (recommendations[i] == maxCount) {
                    isConfused = true;
                }
            }

            if (isConfused) {
                System.out.println("CONFUSED");
            } else {
                System.out.println(laptopToBuy);
            }
        }
    }
}
