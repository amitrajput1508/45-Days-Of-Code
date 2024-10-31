import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            Arrays.sort(A);

            for (int i = 1; i < N - 1; i += 2) {
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }

            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
    }
}
