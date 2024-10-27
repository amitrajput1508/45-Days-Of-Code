import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int a = sc.nextInt();
            int b  = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            int A1= a+c;
            int A2 = a+d;
            int B1 = b+c;
            int B2 = b+d;
            
            if(A1>=A2 && A1>=B1 && A1>=B2){
                System.out.println(+A1);
            }
            else if(A2>=A1&&A2>=B1&&A2>=B2){
                System.out.println(+A2);
            }
            else if(B1>=A1&&B1>=A2&&B1>=B2){
                System.out.println(+B1);
            }
            else {
                System.out.println(+B2);
            }
        }
    }
}
