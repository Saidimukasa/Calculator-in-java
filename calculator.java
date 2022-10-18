// This is a basic Java calculator 
import java.util.Scanner;

public class calculator {
	public static void main(String[]args)
	{
		String oper;
		System.out.println("Enter Your choice to calculate");
		System.out.println("Enter + add");
		System.out.println("Enter - to subtact");
		System.out.println("Enter * to Multipy");
		System.out.println("Enter / to divide");
		Scanner choice=new Scanner(System.in);
		Scanner num=new Scanner(System.in);
		oper=choice.nextLine();
		int number1;
		int number2;
		switch(oper)
		{
		case "+":
		{
			System.out.print("Enter first number");
			number1 =choice.nextInt();
			System.out.print("Enter second number");
			number2=choice.nextInt();
			int sum=number1+number2;
			System.out.println("The sum is "+sum);
			break;	
		}
		case "-":
		{
			System.out.print("Enter first number");
			number1=choice.nextInt();
			System.out.print("Enter second number");
			number2=choice.nextInt();
			int difference=number1-number2;
			System.out.println("The difference is "+difference);
			break;	
		}
		case "*":
		{
			System.out.print("Enter first number");
			number1=choice.nextInt();
			System.out.print("Enter second number");
			number2=choice.nextInt();
			int product=number1*number2;
			System.out.println("The  product is "+ product);
			break;	
		}
		case "/":
		{
			System.out.print("Enter first number");
			number1=choice.nextInt();
			System.out.print("Enter second number");
			number2=choice.nextInt();
			int Quotient=number1/number2;
			System.out.println("The the Quotient is "+Quotient);
			break;	
		}   
		}	
	}

}
