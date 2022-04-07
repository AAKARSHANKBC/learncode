package loop_statement_demo;

import java.util.Scanner;

public class Sum_Natural_number 
{

	public static void main(String[] args) 
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number upto which sum is required:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        	sum+=i;
        System.out.println("sum of "+n+" natural number is " +sum );
    
	}

}
