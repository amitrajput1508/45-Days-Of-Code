import java.util.Scanner;

public class BearAndCandies123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int limakCandies = 0, bobCandies = 0;
            int turn = 1;
            
            while (true) {
                if (turn % 2 != 0) {
                    limakCandies += turn;
                    if (limakCandies > A) {
                        System.out.println("Bob");
                        break;
                    }
                } else {
                    bobCandies += turn;
                    if (bobCandies > B) {
                        System.out.println("Limak");
                        break;
                    }
                }
                turn++;
            }
        }
        
        scanner.close();
    }
}
