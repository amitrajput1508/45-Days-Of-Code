import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String haystack = scanner.nextLine();
        String needle = scanner.nextLine();
        System.out.println(strStr(haystack, needle));
        scanner.close();
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
