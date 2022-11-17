
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args)
	{
		// stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		num1 = sc.nextDouble();

		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);

		double o = 0;

		switch (op) {

		case '+':

			o = num1 + num2;

			break;

		case '-':

			o = num1 - num2;

			break;

		case '*':

			o = num1 * num2;

			break;

		case '/':

			o = num1 / num2;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	}
}

COMMENT
