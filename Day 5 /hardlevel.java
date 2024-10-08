import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  
        
        
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of rotations (k): ");
        int k = scanner.nextInt();
        new Solution().rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
        
        scanner.close();
    }
}
