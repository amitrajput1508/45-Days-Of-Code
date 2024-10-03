import java.util.Scanner;

class HostelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
 
        for (int t = 0; t < T; t++) {
      
            int N = sc.nextInt();
            int X = sc.nextInt();
            
       
            int currentPeople = X;
        
            int maxPeople = X;
    
            for (int i = 0; i < N; i++) {
                int event = sc.nextInt();
 
                currentPeople += event;

                if (currentPeople > maxPeople) {
                    maxPeople = currentPeople;
                }
            }
            
            System.out.println(maxPeople);
        }
        
        sc.close();
    }
}
