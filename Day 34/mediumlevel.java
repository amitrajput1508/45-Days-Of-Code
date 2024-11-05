import java.util.Scanner;

public class TraceOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            int maxTrace = 0;
            for (int startRow = 0; startRow < N; startRow++) {
                int trace = 0;
                for (int i = startRow, j = 0; i < N && j < N; i++, j++) {
                    trace += matrix[i][j];
                }
                maxTrace = Math.max(maxTrace, trace);
            }
            
            for (int startCol = 1; startCol < N; startCol++) {
                int trace = 0;
                for (int i = 0, j = startCol; i < N && j < N; i++, j++) {
                    trace += matrix[i][j];
                }
                maxTrace = Math.max(maxTrace, trace);
            }
            
            System.out.println(maxTrace);
        }
        
        sc.close();
    }
}
