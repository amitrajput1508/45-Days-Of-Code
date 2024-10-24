import java.util.Scanner;

public class PolynomialDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int degree = 0;
            
            for (int i = 0; i < N; i++) {
                int coeff = sc.nextInt();
                if (coeff != 0) {
                    degree = i;
                }
            }
            
            System.out.println(degree);
        }
        
        sc.close();
    }
}
