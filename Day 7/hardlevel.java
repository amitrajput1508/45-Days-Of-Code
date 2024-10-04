import java.util.Scanner;

public class Solution {  
    public boolean canJump(int[] nums) {
        int maxReach = 0; 
        
        for (int i = 0; i < nums.length; i++) {

            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            
            
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        boolean result = solution.canJump(nums);

        if (result) {
            System.out.println("Output: true (You can reach the last index)");
        } else {
            System.out.println("Output: false (You cannot reach the last index)");
        }

        sc.close();
    }
}
