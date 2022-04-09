package mypackage;

import java.util.Scanner;
/* 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 */

public class Pattern_Demo_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,input;
		System.out.println("enter the number of line");
		input=sc.nextInt();
		
	// actual logic
		for(i=1;i<=input;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(+i +" " );
			    System.out.print("\n");
		}

	}

}
