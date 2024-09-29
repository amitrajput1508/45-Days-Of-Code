import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int Dragon_dsa = sc.nextInt();
            int Dragon_toc = sc.nextInt();
            int Dragon_dm = sc.nextInt();
            int Dragon_total = Dragon_dsa + Dragon_toc + Dragon_dm;

            int Sloth_dsa = sc.nextInt();
            int Sloth_toc = sc.nextInt();
            int Sloth_dm = sc.nextInt();
            int Sloth_total = Sloth_dsa + Sloth_toc + Sloth_dm;

            if (Dragon_total > Sloth_total) {
                System.out.println("Dragon");
            } else if (Dragon_total < Sloth_total) {
                System.out.println("Sloth");
            } else {
                if (Dragon_dsa > Sloth_dsa) {
                    System.out.println("Dragon");
                } else if (Dragon_dsa < Sloth_dsa) {
                    System.out.println("Sloth");
                } else {
                    if (Dragon_toc > Sloth_toc) {
                        System.out.println("Dragon");
                    } else if (Dragon_toc < Sloth_toc) {
                        System.out.println("Sloth");
                    } else {
                        System.out.println("Tie");
                    }
                }
            }
        }
    }
}