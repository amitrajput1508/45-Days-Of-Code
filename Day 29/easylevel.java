import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int P = scanner.nextInt();
            int Q = scanner.nextInt();
            int totalPoints = P + Q;

            if ((totalPoints / 2) % 2 == 0) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
