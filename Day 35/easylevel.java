import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int easy = A*1;
            int hard = B*2;
            int total = easy+hard;
            
            if(total>=X){
                System.out.println("Qualify");
            }
            else{
                System.out.println("NotQualify");
            }
        }
    }
}
