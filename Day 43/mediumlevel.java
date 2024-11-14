import java.util.Scanner;

public class OddPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long odd = (N + 1) / 2;
            long even = N / 2;
            long pairs = odd * even * 2;
            System.out.println(pairs);
        }
        
        sc.close();
    }
}
