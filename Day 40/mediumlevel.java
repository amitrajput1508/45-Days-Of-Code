import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            
            int neededWins = (N / 2) + 1;
            int currentWins = 0;
            int[] additionalVotes = new int[N];
            
            for (int i = 0; i < N; i++) {
                if (A[i] > B[i]) {
                    currentWins++;
                } else {
                    additionalVotes[i] = B[i] - A[i] + 1;
                }
            }
            
            if (currentWins >= neededWins) {
                System.out.println("YES");
                continue;
            }
            
            java.util.Arrays.sort(additionalVotes);
            boolean possible = false;
            
            for (int i = 0; i < N && currentWins < neededWins && X >= additionalVotes[i]; i++) {
                if (additionalVotes[i] > 0 && X >= additionalVotes[i]) {
                    X -= additionalVotes[i];
                    currentWins++;
                }
                if (currentWins >= neededWins) {
                    possible = true;
                    break;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}
