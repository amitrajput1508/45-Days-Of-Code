import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int Aa = 500-x*2;
            int sum = x+y;
            int Ab = 1000-sum*4;
            int Ba = 500-sum*2;
            int Bb = 1000-y*4;
            int sumA = Aa+Ab;
            int sumB = Ba+Bb;
            
            if(sumA>sumB){
                System.out.println(+sumA);
            }
            else{
                System.out.println(+sumB);
            }
        }
    }
}
