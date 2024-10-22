import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int first = 10*A;
            int Second = 5*B;
            
            if(first>Second){
                System.out.println("FIRST");
            }
            else if(Second>first){
                System.out.println("SECOND");
            }
            else {
                System.out.println("ANY");
            }
        }
    }
}
