import java.util.Arrays;
import java.util.Scanner;

public class Solution {  
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int n = scanner.nextInt();
        
        int[] digits = new int[n];
        
        System.out.println("Enter the digits one by one:");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }

        int[] result = plusOne(digits);
        
        System.out.println("Result after incrementing by one:");
        System.out.println(Arrays.toString(result));
        
        scanner.close();
    }
}
