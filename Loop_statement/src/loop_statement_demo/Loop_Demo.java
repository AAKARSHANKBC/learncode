package loop_statement_demo;

import java.util.Scanner;

public class Loop_Demo 
{
	public static void main(String[] args)
	
	// print hello n time using for loop
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your words:");
		String st=sc.nextLine();
		System.out.println("please enter number of time to print the above words ");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
			System.out.println(st);
		
			
	}
}
