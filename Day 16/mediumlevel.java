import java.util.Scanner;

public class MessageEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            String S = sc.next();
            char[] chars = S.toCharArray();

            for (int i = 0; i < N - 1; i += 2) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
            }

            for (int i = 0; i < N; i++) {
                chars[i] = (char) ('a' + ('z' - chars[i]));
            }

            System.out.println(new String(chars));
        }
    }
}
