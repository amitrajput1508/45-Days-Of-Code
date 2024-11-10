import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0){
	        int N = sc.nextInt();    // the number of enemies
	        int X = sc.nextInt();    // the damage caused by the single-target mode of Inferno in one second respectively.
	        int H[] = new int[N];
	        int SingleTargetmode = 0;
	        int MultiTargetmode = 0;
	        
	        for(int i=0; i<N; i++){
	            H[i] = sc.nextInt();  
	            SingleTargetmode = SingleTargetmode + (H[i]+X-1)/X;
	            MultiTargetmode = Math.max(MultiTargetmode, H[i]);
	        }
	        
	        System.out.println(Math.min(SingleTargetmode, MultiTargetmode));
	    }
	}
}


