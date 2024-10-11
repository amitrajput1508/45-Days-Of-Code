import java.util.Scanner;

public class MaxTastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int option1 = Math.max(a, b);  // Max between A and B
            int option2 = Math.max(c, d);  // Max between C and D

            System.out.println(option1 + option2);
        }
    }
}
