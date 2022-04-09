package mypackage;

import java.util.Scanner;
/*  1
 *  1 2
 *  1 2 3
 *  1 2 3  4
 */
public class Pattern_Demo_1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input;
		System.out.println("enter the number of line");
		input=sc.nextInt();
		
			// loigic here
		for(int i=1;i<=input;i++)
		{ for(int j=1;j<=i;j++)
				 System.out.print(+j );
		         System.out.println("\n");
		}
	}

}
