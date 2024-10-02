import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            if(A>50){
                System.out.println("A");
            }
            else if(B>50){
                System.out.println("B");
            }
            else if(C>50){
                System.out.println("C");
            }
            else {
                System.out.println("NOTA");
            }
        }
    }
}
