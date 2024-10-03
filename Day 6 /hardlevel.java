import java.util.Scanner;

public class Solution {  
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);  

            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currRow += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();


        Solution solution = new Solution();
        String result = solution.convert(inputString, numRows);
        System.out.println("Zigzag converted string:");
        System.out.println(result);

        scanner.close();  
    }
}
