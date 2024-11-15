import java.util.Scanner;

public class ChefEren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int oddEpisodes = (N + 1) / 2;
            int evenEpisodes = N / 2;
            int totalDuration = oddEpisodes * B + evenEpisodes * A;
            System.out.println(totalDuration);
        }
        
        scanner.close();
    }
}
