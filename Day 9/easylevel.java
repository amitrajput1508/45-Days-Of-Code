import java.util.Scanner;

class ChefWeights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int W = sc.nextInt();
            int X = sc.nextInt(); 
            int Y = sc.nextInt(); 
            int Z = sc.nextInt(); 

            if (W == X || W == Y || W == Z || 
                W == X + Y || W == X + Z || W == Y + Z || 
                W == X + Y + Z) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
