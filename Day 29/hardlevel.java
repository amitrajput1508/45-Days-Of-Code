import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            
            if (i > 0) {
                row.add(1);
            }
            
            triangle.add(row);
        }
        
        return triangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(numRows);
        
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
