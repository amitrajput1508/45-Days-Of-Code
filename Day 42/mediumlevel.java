import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] songs = new int[N];
            
            for (int i = 0; i < N; i++) {
                songs[i] = sc.nextInt();
            }
            
            int K = sc.nextInt() - 1;
            int uncleJohnySong = songs[K];
            
            Arrays.sort(songs);
            
            int newPosition = 0;
            for (int i = 0; i < N; i++) {
                if (songs[i] == uncleJohnySong) {
                    newPosition = i + 1;
                    break;
                }
            }
            
            System.out.println(newPosition);
        }
    }
}
