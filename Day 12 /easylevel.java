import java.util.Scanner;

class FlipCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int flips = Math.min(X, N - X);
            System.out.println(flips);
        }
    }
}
