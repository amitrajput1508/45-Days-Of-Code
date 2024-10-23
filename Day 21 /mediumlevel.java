import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int ties = Math.min(Y, X);  
            int winsNeeded = X - ties;
            
            System.out.println(Math.max(0, winsNeeded));
        }
        
        sc.close();
    }
}
