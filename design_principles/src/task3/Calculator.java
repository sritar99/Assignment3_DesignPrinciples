package task3;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
			System.out.print("Enter Your Choice: ");
			int x=s.nextInt();
			if(x == 5)
			{
				break;
			}
			System.out.print("Enter first number: ");
			float num1=s.nextFloat();
			System.out.print("Enter second number: ");
			float num2=s.nextFloat();
			float[] result = {(num1+num2),(num1-num2),(num1*num2),(num1/num2)};
			if(x>0 || x<5)
			{
				System.out.println("Your Answer is " + result[x-1]);
			}
			else
			{
				System.out.println("Wrong Choice!");
			}
			System.out.print("Do you want another operation?\n[Any key for Yes/ N for NO]\nYour Choice: ");
			char choice = s.next().charAt(0);
			if(choice == 'N' || choice == 'n')
			{
				break;
			}
			System.out.println();
		}
		System.out.println("Successfully Closed.");
	}

}
