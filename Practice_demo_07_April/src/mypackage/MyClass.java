package mypackage;

import java.util.Scanner;

public class MyClass 
{   // find the factorial  
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int fact=1;
		int i;
		// logic
		for(i=1;i<=num;i++)
			fact=fact*i;
		System.out.println("the factorial of "+num+ " is " +fact);
		
	
	}
}
