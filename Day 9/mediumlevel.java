import java.util.Scanner;

class MaskPolicy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int uninfected = N - A;
            System.out.println(Math.min(A, uninfected));
        }
        
        sc.close();
    }
}
