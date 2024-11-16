import java.util.Scanner;

public class EncodingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            String S = scanner.next();
            char[] chars = S.toCharArray();

            for (int i = 0; i + 1 < N; i += 2) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
            }

            for (int i = 0; i < N; i++) {
                chars[i] = (char) ('a' + ('z' - chars[i]));
            }

            System.out.println(new String(chars));
        }
        scanner.close();
    }
}
