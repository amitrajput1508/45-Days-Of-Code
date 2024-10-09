import java.util.Scanner;

class TanuAndHeadBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String gestures = sc.next();
            if (gestures.contains("I")) {
                System.out.println("INDIAN");
            } else if (gestures.contains("Y")) {
                System.out.println("NOT INDIAN");
            } else {
                System.out.println("NOT SURE");
            }
        }
    }
}
