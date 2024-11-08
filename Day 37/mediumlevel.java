import java.util.Scanner;

public class MagicianVsChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int S = sc.nextInt();

            int currentBox = X;
            for (int i = 0; i < S; i++) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (currentBox == A) {
                    currentBox = B;
                } else if (currentBox == B) {
                    currentBox = A;
                }
            }
            System.out.println(currentBox);
        }
        sc.close();
    }
}
