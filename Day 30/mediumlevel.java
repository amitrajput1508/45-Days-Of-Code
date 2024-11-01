import java.util.Scanner;
import java.util.Arrays;

public class ConvertToPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            Arrays.sort(A);
            int operations = 0;
            boolean possible = true;

            for (int i = 0; i < N; i++) {
                int target = i + 1;
                if (A[i] > target) {
                    possible = false;
                    break;
                } else {
                    operations += target - A[i];
                }
            }

            System.out.println(possible ? operations : -1);
        }

        scanner.close();
    }
}
