import java.util.Scanner;

class PoliceAndThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int x = sc.nextInt(); 
            int y = sc.nextInt(); 
            
   
            int max = Math.abs(x - y);
            

            System.out.println(max);
        }
        
        sc.close();
    }
}
