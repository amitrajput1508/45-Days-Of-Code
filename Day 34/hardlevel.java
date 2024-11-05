import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        
        while (i < n) {
            int start = nums[i];
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
            i++;
        }
        
        return ranges;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Solution solution = new Solution();
        List<String> result = solution.summaryRanges(nums);
        
        System.out.println("Summary Ranges:");
        for (String range : result) {
            System.out.println(range);
        }
        
        sc.close();
    }
}
