import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            
            if (sum % 2 != 0) {
                System.out.println(-1);
            } else {
                int flips = 0;
                if (sum > 0) {
                    for (int i = 0; i < N; i++) {
                        if (A[i] == 1 && sum > 0) {
                            flips++;
                            sum -= 2;
                        }
                    }
                } else {
                    for (int i = 0; i < N; i++) {
                        if (A[i] == -1 && sum < 0) {
                            flips++;
                            sum += 2;
                        }
                    }
                }
                System.out.println(flips);
            }
        }
    }
}
