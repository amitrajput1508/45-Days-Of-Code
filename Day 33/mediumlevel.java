import java.util.Scanner;

public class AdjacentSumParity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextInt();
            }
            
            int countOnes = 0;
            for (int i = 0; i < N; i++) {
                if (B[i] == 1) countOnes++;
            }
            
            if (countOnes % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
