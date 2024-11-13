import java.util.Scanner;

public class LowestFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int minPrice = Math.min(A, Math.min(B, C));
            int totalCost = A + B + C - minPrice;
            System.out.println(totalCost);
        }
    }
}
