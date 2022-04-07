package decision_making;

import java.util.Scanner;

public class Even_Odd 
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check even or odd: ");
		a=sc.nextInt();
		// check condition using if statement
		if(a%2==0)
			System.out.println("the number "+a+" is even number");
		else
			System.out.println("the number "+a+" is odd number");
	}
}
