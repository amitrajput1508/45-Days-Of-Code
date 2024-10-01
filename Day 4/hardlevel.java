import java.util.Scanner;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String shortestStr = strs[0];
        for (String str : strs) {
            if (str.length() < shortestStr.length()) {
                shortestStr = str;
            }
        }

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < shortestStr.length(); i++) {
            char currentChar = shortestStr.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = scanner.nextLine();
        }

        Solution solution = new Solution();
        String result = solution.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: \"" + result + "\"");

        scanner.close();
    }
}