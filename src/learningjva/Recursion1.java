package learningjva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Recursion1 {
    //Exceptions are of two type i.e. handled ( compile time) and unhandled( run time e.g. out of bound)
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(new File("/home/abhaykumarsingh/eclipse-workspace/Learning/data/recursion1.txt"));
        int tcs= sc.nextInt();
        while (tcs>0)
        {
        	int n= sc.nextInt();
        	recur(n,n,true);
        	System.out.println();
        	tcs--;
        }
	}
	// boolean flag just to check that after once vlaue is in -ve then again no need to minus the integer N, m is for to check the value to N
	public static void recur(int n,int m,boolean flag)
	{
		if (n>0&&flag==true)
		{   
			System.out.print(n+ " ");
			n=n-5;
		}
		else {
			flag =false;
			System.out.print(n+ " ");
			if(n==m)
			return;
			n=n+5;
		}
		recur(n, m,flag);
	}

}
