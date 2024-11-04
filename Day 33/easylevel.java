import java.util.Scanner;

public class GoodProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            if (N % 4 == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Not Good");
            }
        }
        scanner.close();
    }
}
