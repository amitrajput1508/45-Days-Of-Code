import java.util.Scanner;

public class NotebookFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int notebooks = (N * 1000) / 100;
            System.out.println(notebooks);
        }
    }
}
