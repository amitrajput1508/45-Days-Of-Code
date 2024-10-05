import java.util.Scanner;

class PseudoSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            if (isPseudoSorted(A, N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean isPseudoSorted(int[] A, int N) {
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] > A[i + 1]) {
                count++;
                if (count > 1) return false;
                if (i > 0 && A[i - 1] > A[i + 1] && (i + 2 < N && A[i] > A[i + 2])) {
                    return false;
                }
            }
        }
        return true;
    }
}
