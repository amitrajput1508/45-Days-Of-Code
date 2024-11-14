import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int P = sc.nextInt();
            
            int score = X * 3 - (N - X);
            
            if (score >= P) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
        
        sc.close();
    }
}
