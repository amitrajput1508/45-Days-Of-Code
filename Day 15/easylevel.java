import java.util.Scanner;

class FillCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int M = sc.nextInt();
            
            int candiesPerBag = K * M;
            int bagsNeeded = (N + candiesPerBag - 1) / candiesPerBag;
            
            System.out.println(bagsNeeded);
        }
        
        sc.close();
    }
}
