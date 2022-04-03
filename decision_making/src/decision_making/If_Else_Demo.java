package decision_making;

import java.util.Scanner;

public class If_Else_Demo 
{

	public static void main(String[] args) 
	{
		// if else statement
		// TAKING USER NAME & PASSWORD
		//CHECK USER NAME & PASSWORD , USER NAME AAKARSHAN, PASS- 1234;
		System.out.println("WELCOME TO LOGIN PAGE");
		System.out.println("**********************");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your user id : ");
        String id=sc.next();
        System.out.println("Enter your password ;");
        String pass=sc.next();
        
        if(id.equals("AAKARSHAN") && pass.equals("1234"))
        {
        System.out.println("welcome "+id);
        }
        else
        {	
        	System.out.println("your login failed,please enter correct user name & password");
        }
}
}