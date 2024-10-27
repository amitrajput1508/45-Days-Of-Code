import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Number of plucks Chef will make
            int[] S = new int[N];
            
            // Reading the sequence of strings Chef will pluck
            for (int i = 0; i < N; i++) {
                S[i] = sc.nextInt();
            }
            
            int totalSkips = 0;
            // Calculate skips for each consecutive pair
            for (int i = 0; i < N - 1; i++) {
                totalSkips += Math.abs(S[i] - S[i + 1]) - 1;
            }
            
            // Print result for the current test case
            System.out.println(totalSkips);
        }
        
        sc.close();
    }
}
