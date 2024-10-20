import java.util.Scanner;

class BinaryBattles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            int rounds = (int)(Math.log(N) / Math.log(2));
            int totalTime = rounds * A + (rounds - 1) * B;
            
            System.out.println(totalTime);
        }
        
        scanner.close();
    }
}
