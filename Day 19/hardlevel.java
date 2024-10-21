import java.util.Scanner;

public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(prev.charAt(prev.length() - 1));
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        Solution obj = new Solution();
        System.out.println("The " + n + "th element of the count-and-say sequence is: " + obj.countAndSay(n));
    }
}
