import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (Y <= N * X && Y % X == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
