import java.util.Scanner;

public class RetrieveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            long[] B = new long[N];
            
            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextLong();
            }

            long totalSum = B[0];
            for (int i = 1; i < N; i++) {
                totalSum += B[i];
            }
            
            long sumA = totalSum / (N + 1);

            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = B[i] - sumA;
            }

            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
