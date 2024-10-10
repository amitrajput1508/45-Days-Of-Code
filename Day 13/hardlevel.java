import java.util.Scanner;

public class Solution {
    public int jump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        
        return jumps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();  // Read the length of the array
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();  // Read each element of the array
        }
        
        Solution sol = new Solution();
        int result = sol.jump(nums);
        System.out.println("Minimum number of jumps to reach the last index: " + result);
        
        sc.close();
    }
}
