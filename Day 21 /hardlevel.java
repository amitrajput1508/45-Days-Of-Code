import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateCombinations(result, "", 0, 0, n);
        return result;
    }

    private void generateCombinations(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            generateCombinations(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            generateCombinations(result, current + ")", open, close + 1, max);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs of parentheses (n): ");
        int n = sc.nextInt();
        
        Solution solution = new Solution();
        List<String> result = solution.generateParenthesis(n);
        
        System.out.println(result);
        sc.close();
    }
}
