import java.util.Scanner;

class TravelTimeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            if (X < Y) {
                System.out.println("BIKE");
            } else if (X > Y) {
                System.out.println("CAR");
            } else {
                System.out.println("SAME");
            }
        }
        
        scanner.close();
    }
}
