package loop_statement_demo;
import java.util.Scanner;

public class Factor_demo {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number whose factor is to be calculated");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{ 
			if(n%i==0)
			System.out.println(i);
		}
	}

}
