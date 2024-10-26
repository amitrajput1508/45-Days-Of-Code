import java.util.Scanner;

public class ChefAndGlove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] fingers = new int[N];
            int[] sheaths = new int[N];
            
            for (int i = 0; i < N; i++) {
                fingers[i] = scanner.nextInt();
            }
            for (int i = 0; i < N; i++) {
                sheaths[i] = scanner.nextInt();
            }
            
            boolean front = true;
            boolean back = true;
            
            for (int i = 0; i < N; i++) {
                if (fingers[i] > sheaths[i]) {
                    front = false;
                }
                if (fingers[i] > sheaths[N - i - 1]) {
                    back = false;
                }
            }
            
            if (front && back) {
                System.out.println("both");
            } else if (front) {
                System.out.println("front");
            } else if (back) {
                System.out.println("back");
            } else {
                System.out.println("none");
            }
        }
        
        scanner.close();
    }
}
