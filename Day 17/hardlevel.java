import java.util.Scanner;

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        // Handle the special case for Integer.MIN_VALUE
        if (n == Integer.MIN_VALUE) {
            x = 1 / x;
            n = Integer.MAX_VALUE; // Since -n overflows, we reduce by 1 to avoid overflow
            return x * myPow(x, n);
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base (x): ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        double result = solution.myPow(x, n);
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
