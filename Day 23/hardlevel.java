import java.util.Scanner;

public class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string s: ");
        String s = scanner.nextLine();
        System.out.print("Enter the substring part: ");
        String part = scanner.nextLine();

        Solution solution = new Solution();
        String result = solution.removeOccurrences(s, part);
        System.out.println("Resulting string: " + result);

        scanner.close();
    }
}
