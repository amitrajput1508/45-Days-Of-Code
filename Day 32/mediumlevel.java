import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            ArrayList<Integer> primes = generatePrimes((int) Math.sqrt(n) + 1);
            boolean[] isPrime = new boolean[n - m + 1];
            for (int j = 0; j < isPrime.length; j++) {
                isPrime[j] = true;
            }
            for (int prime : primes) {
                int start = Math.max(prime * prime, (m + prime - 1) / prime * prime);
                for (int j = start; j <= n; j += prime) {
                    isPrime[j - m] = false;
                }
            }
            if (m == 1) isPrime[0] = false;
            for (int j = 0; j < isPrime.length; j++) {
                if (isPrime[j]) {
                    output.append((j + m)).append("\n");
                }
            }
            if (i < t - 1) output.append("\n");
        }
        System.out.print(output.toString());
        scanner.close();
    }

    private static ArrayList<Integer> generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int j = p * p; j <= limit; j += p) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
