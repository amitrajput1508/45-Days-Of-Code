import java.util.Scanner;

public class ReachFast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int K = scanner.nextInt();
            int distance = Math.abs(A - B);
            int steps = (distance + K - 1) / K;
            System.out.println(steps);
        }
        scanner.close();
    }
}
