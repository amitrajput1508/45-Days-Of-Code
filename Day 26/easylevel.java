import java.util.Scanner;

public class MutatedMinions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;
            
            for (int i = 0; i < N; i++) {
                int characteristic = sc.nextInt();
                if ((characteristic + K) % 7 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
