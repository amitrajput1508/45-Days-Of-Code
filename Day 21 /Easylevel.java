import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int normalAttacksOnly = (H + X - 1) / X;
            
            int specialAndNormalAttacks;
            if (H > Y) {
                int remainingHealthAfterSpecial = H - Y;
                specialAndNormalAttacks = 1 + (remainingHealthAfterSpecial + X - 1) / X;
            } else {
                specialAndNormalAttacks = 1;
            }
            
            System.out.println(Math.min(normalAttacksOnly, specialAndNormalAttacks));
        }
        
        sc.close();
    }
}
