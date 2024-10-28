import java.util.HashMap;
import java.util.Scanner;

class Buy1Get1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            String S = sc.next();
            HashMap<Character, Integer> jewelCount = new HashMap<>();
            int cost = 0;
            
            for (char jewel : S.toCharArray()) {
                jewelCount.put(jewel, jewelCount.getOrDefault(jewel, 0) + 1);
            }
            
            for (int count : jewelCount.values()) {
                cost += (count + 1) / 2;
            }
            
            System.out.println(cost);
        }
        sc.close();
    }
}
