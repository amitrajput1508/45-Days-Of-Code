import java.util.Scanner;

public class AttackOfQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong();
            long X = scanner.nextLong();
            long Y = scanner.nextLong();
            
            long horizontal = N - 1;
            long vertical = N - 1;
            long diagonal1 = Math.min(X - 1, Y - 1) + Math.min(N - X, N - Y);
            long diagonal2 = Math.min(X - 1, N - Y) + Math.min(N - X, Y - 1);
            
            long result = horizontal + vertical + diagonal1 + diagonal2;
            System.out.println(result);
        }
        
        scanner.close();
    }
}
