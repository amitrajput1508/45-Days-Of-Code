import java.util.Scanner;

public class FarAway {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] A = new int[N];
            long maxDistance = 0;

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                int distance1 = Math.abs(A[i] - 1);
                int distance2 = Math.abs(A[i] - M);
                maxDistance += Math.max(distance1, distance2);
            }

            System.out.println(maxDistance);
        }

        scanner.close();
    }
}
