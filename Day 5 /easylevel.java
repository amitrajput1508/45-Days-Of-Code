import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();
            int a = b1+b2+b3;
            
            if(a == 0){
                System.out.println("Water filling time");
            }
            else if(a == 1){
                System.out.println("Water filling time");
            }
            else 
            System.out.println("Not now");
        }
    }
}
