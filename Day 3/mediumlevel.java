import java.util.Scanner;

class BreakTheStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            long X = sc.nextLong();

            if (N % 2 == 0 || X % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}