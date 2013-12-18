package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Tyocean's Calculator.");
		System.out.println("Please enter the corrosponding number:");
		System.out
				.println("1. Addition | 2. Subtraction | 3. Multiplication | 4. Division");

		System.out.println("Enter here: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		System.out.println("Enter first number: ");
		int num1 = Integer.parseInt(scanner.next());
		System.out.println("Enter second number: ");
		int num2 = Integer.parseInt(scanner.next());

		switch (Integer.parseInt(input)) {
		case 1:
			System.out.println(num1 + " plus " + num2 + " = "
					+ Calculator.add(num1, num2));
			break;
		case 2:
			System.out.println(num1 + " minus " + num2 + " = "
					+ Calculator.subtract(num1, num2));
			break;
		case 3:
			System.out.println(num1 + " times " + num2 + " = "
					+ Calculator.multiply(num1, num2));
			break;
		case 4:
			System.out.println(num1 + " divided by " + num2 + " = "
					+ Calculator.divide(num1, num2));
			break;
		default:
			System.out.println("Your input is invalid");
		}
	}
}
