/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int n=sc.nextInt();
		    int plane = x*100;
		    n-= plane;
		    if(n<=0){
		        System.out.println(0);
		    }else{
		        int div = n/100;
		        if(n%100!=0)
		            div++;
		            System.out.println(div);
		        
		    }
		}
	}
}
