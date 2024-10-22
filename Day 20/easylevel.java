import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int r1=sc.nextInt();
            int r2= sc.nextInt();
            int r3= sc.nextInt();
            int r4= sc.nextInt();
            int s = r1+r2+r3+r4;
            
            if(s==4 || s==1 || s==2 || s==3){
                System.out.println("OUT");
            }
            else {
                System.out.println("IN");
            }
        }
    }
}
