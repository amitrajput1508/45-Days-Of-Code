import java.util.Scanner;

public class PresentsForCheffina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            long N = scanner.nextLong();
            System.out.println(N - N / 5);
        }
        scanner.close();
    }
}
