package decision_making;

import java.util.Scanner;

public class Decision_making_Demo 
{

	public static void main(String[] args) 
	// decision making
	//IF statement
	{
		int age;
		String name;
    Scanner s= new Scanner(System.in);
    System.out.println("to check eligiblity for voting");
    System.out.println("*******************************");
    System.out.println("enter your name :");
    name=s.nextLine();
    System.out.println("enter your age :");
    age=s.nextInt();
    
    if(age>=18)
    {
    System.out.println("hi, "+name+", your are eligible for voting");	
    }

}
}
