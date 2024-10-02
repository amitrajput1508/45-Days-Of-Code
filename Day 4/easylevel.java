import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        
        if(X==A || X==B || X==C){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
