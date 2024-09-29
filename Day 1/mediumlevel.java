import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String s = sc.next();
            
            String vowels = "aeiou";
            int count = 0;
            boolean hard = false;
            
            for(int j=0;j<n;j++){
                char ch = s.charAt(j);
                
                if(!vowels.contains(String.valueOf(ch))){
                    count++;
                    if(count>=4){
                        hard = true;
                        break;
                    }
                }
                    else {
                        count = 0;
                    }
                }
                
                if(hard){
                    System.out.println("No");
                }
                else {
                    System.out.println("Yes");
                }
            }
            sc.close();
        }
        
    }