import java.util.Scanner;

public class ChefAndSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < N; i++) {
                int D = scanner.nextInt();
                if (D % K == 0) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            }
            System.out.println(result);
        }
    }
}
