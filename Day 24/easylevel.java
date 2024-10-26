import java.util.Scanner;

public class DraculaEats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int tuesdays = (N >= 2) ? ((N - 2) / 7) + 1 : 0;
            System.out.println(tuesdays);
        }
        
        scanner.close();
    }
}
