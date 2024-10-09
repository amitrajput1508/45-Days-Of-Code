import java.util.Scanner;

public class Solution {
    public static String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] + 
               hundreds[(num % 1000) / 100] + 
               tens[(num % 100) / 10] + 
               ones[num % 10];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (1 to 3999): ");
        int num = scanner.nextInt();
        
        if (num < 1 || num > 3999) {
            System.out.println("Invalid input. Please enter a number between 1 and 3999.");
        } else {
            System.out.println("Roman numeral: " + intToRoman(num));
        }
    }
}
