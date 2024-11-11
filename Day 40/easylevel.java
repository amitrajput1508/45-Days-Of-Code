import java.util.Scanner;

public class WatchingMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int timeSpent = (Y / 2) + (X - Y);
        System.out.println(timeSpent);
    }
}
