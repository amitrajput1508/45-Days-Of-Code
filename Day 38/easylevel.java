import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int round = 0;
            
            while(N>1){
                N/=2;
                round++;
            }
            
            int total_time = round*A;
            int total_break = (round-1)*B;
            int total = total_time + total_break;
            
            System.out.println(+total);
        }
    }
}
