import java.util.Scanner;

class CoolerDilemma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X >= Y) {
                System.out.println(0);
            } else {
                System.out.println((Y - 1) / X);
            }
        }
    }
}
