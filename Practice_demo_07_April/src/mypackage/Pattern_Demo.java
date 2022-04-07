package mypackage;

import java.util.Scanner;

public class Pattern_Demo 
{   //pattern printing
    /* 
     * 
     * *
     * * *
     * * * *
     */
	public static void main(String[] args)
	{   
		int num;
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number of line ");
		num=obj.nextInt();
		
		//logic
		for(i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" * ");
				System.out.println("\n");
		}	
		
	}

}
