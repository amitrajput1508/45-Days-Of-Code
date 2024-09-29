import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            int p = sc.nextInt();
            
            int n = (x+5)/6;
            int total = n*p;
            
            System.out.println(+total);
            
        }
    }
}