import java.util.Scanner;

class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < N; i++) {
                if (K >= A[i]) {
                    result.append('1');
                    K -= A[i];  
                } else {
                    result.append('0');
                }
            }
            
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}
