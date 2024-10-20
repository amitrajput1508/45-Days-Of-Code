import java.util.Scanner;
import java.util.Arrays;

public class BalancedReversals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            String A = scanner.next();
            
            int count0 = 0, count1 = 0;
            for (char c : A.toCharArray()) {
                if (c == '0') count0++;
                else count1++;
            }
            
            char[] result = new char[N];
            Arrays.fill(result, 0, count0, '0');
            Arrays.fill(result, count0, N, '1');
            
            System.out.println(new String(result));
        }
        
        scanner.close();
    }
}
