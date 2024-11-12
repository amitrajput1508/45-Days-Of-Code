import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int requiredWaterPerPerson = 2 * Y;
            int peopleCount = X / requiredWaterPerPerson;
            System.out.println(peopleCount);
        }
        
        scanner.close();
    }
}
