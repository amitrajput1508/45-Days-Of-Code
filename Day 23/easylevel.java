import java.util.Scanner;

public class ContestProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int start38Count = 0;
            int ltime108Count = 0;

            for (int j = 0; j < N; j++) {
                String contestCode = scanner.next();
                if (contestCode.equals("START38")) {
                    start38Count++;
                } else if (contestCode.equals("LTIME108")) {
                    ltime108Count++;
                }
            }

            System.out.println(start38Count + " " + ltime108Count);
        }
        scanner.close();
    }
}
