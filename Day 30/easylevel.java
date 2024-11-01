import java.util.Scanner;

public class ScoreConsistency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();

            if (C >= A && D >= B) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }

        scanner.close();
    }
}
