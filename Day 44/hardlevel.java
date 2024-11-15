import java.util.Scanner;

public class Solution {
    public boolean canTransform(String start, String result) {
        if (!start.replace("X", "").equals(result.replace("X", ""))) {
            return false;
        }

        int p1 = 0, p2 = 0;
        while (p1 < start.length() && p2 < result.length()) {
            while (p1 < start.length() && start.charAt(p1) == 'X') {
                p1++;
            }
            while (p2 < result.length() && result.charAt(p2) == 'X') {
                p2++;
            }

            if (p1 == start.length() || p2 == result.length()) {
                return p1 == start.length() && p2 == result.length();
            }

            if (start.charAt(p1) != result.charAt(p2)) {
                return false;
            }

            if (start.charAt(p1) == 'L' && p1 < p2) {
                return false;
            }
            if (start.charAt(p1) == 'R' && p1 > p2) {
                return false;
            }

            p1++;
            p2++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start string:");
        String start = scanner.nextLine();
        System.out.println("Enter the result string:");
        String result = scanner.nextLine();

        Solution solution = new Solution();
        boolean canTransform = solution.canTransform(start, result);
        System.out.println(canTransform);

        scanner.close();
    }
}
