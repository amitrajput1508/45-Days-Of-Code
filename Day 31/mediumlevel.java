import java.util.Scanner;

public class MovieWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();  // Number of movies
            
            int[] L = new int[n];  // Lengths of the movies
            int[] R = new int[n];  // Ratings of the movies
            
            // Read lengths
            for (int i = 0; i < n; i++) {
                L[i] = scanner.nextInt();
            }
            
            // Read ratings
            for (int i = 0; i < n; i++) {
                R[i] = scanner.nextInt();
            }
            
            // Variables to keep track of the best movie index and criteria
            int bestIndex = 0;
            int maxProduct = L[0] * R[0];
            int maxRating = R[0];
            
            // Iterate through the movies to find the best one
            for (int i = 1; i < n; i++) {
                int currentProduct = L[i] * R[i];
                
                // Check if the current movie is better based on the criteria
                if (currentProduct > maxProduct ||
                    (currentProduct == maxProduct && R[i] > maxRating) ||
                    (currentProduct == maxProduct && R[i] == maxRating && i < bestIndex)) {
                    
                    bestIndex = i;
                    maxProduct = currentProduct;
                    maxRating = R[i];
                }
            }
            
            // Output the best movie index (1-based index)
            System.out.println(bestIndex + 1);
        }
        
        scanner.close();
    }
}
