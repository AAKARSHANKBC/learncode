package decision_making;

import java.util.Scanner;

public class If_Else_If_Demo {

	public static void main(String[] args) {
		// if else if statement example
		// do arthmethic operation eg add,subs,mul,div;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number:");
		int first_number=s.nextInt();
		System.out.println("enter second number:");
		int second_number=s.nextInt();
		System.out.println("please enter opertor symbol to perform that operation like +,-,*,/");
		char ch=s.next().charAt(0);
		if(ch=='+')
		{    
			int add =first_number+second_number;
			System.out.println("additiobn of two number is"+add);
		}
		
		else if(ch=='-')
		{
			int sub=first_number - second_number;
			System.out.println("substraction of two number is "+sub);	
		}
		else if(ch=='*')
		{
			int mul= first_number * second_number;
			System.out.println("multiplication of two number is "+mul);
		}
		
		else if(ch=='/')
		{
			int div= first_number / second_number;
			System.out.println("division of two number is "+div);
		}
		else 
		{
			System.out.println("WRONG INPUT");
		}
	}

}
