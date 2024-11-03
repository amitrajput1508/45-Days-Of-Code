import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
        int player1CumulativeScore = 0;
        int player2CumulativeScore = 0;
        int maxLead = 0;
        int winner = 0;

        for (int i = 0; i < rounds; i++) {
            int player1Score = scanner.nextInt();
            int player2Score = scanner.nextInt();

            player1CumulativeScore += player1Score;
            player2CumulativeScore += player2Score;

            int lead = Math.abs(player1CumulativeScore - player2CumulativeScore);
            if (lead > maxLead) {
                maxLead = lead;
                winner = (player1CumulativeScore > player2CumulativeScore) ? 1 : 2;
            }
        }

        System.out.println(winner + " " + maxLead);
        scanner.close();
    }
}
