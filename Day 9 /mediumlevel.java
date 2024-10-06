import java.util.Scanner;

class CoolerDilemma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (Y%X==0) {
                System.out.println(Y/X-1);
            } else {
                System.out.println(Y/X);
            }
        }
    }
}
