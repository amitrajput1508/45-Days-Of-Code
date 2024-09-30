import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int work = 4*x;
            int chill = y*1;
            
            int fin = work +chill;
            System.out.println(+fin);
        }
    }
}