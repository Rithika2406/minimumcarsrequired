import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int ans = 0;
		    if(n < 4 && n > 0){
		     ans = 1;   
		    }else if(n %4 == 0){
		        ans = n/4;
		    }else{
		        ans = n/4 + 1;
		    }
		    System.out.println(ans);
		}
	}
}