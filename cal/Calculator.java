package cal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("---- Application Started ----");

		int num1 = 0, num2 = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("");
			System.out.println("======== MENU ========");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");
			System.out.println("======================");

			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();

			if (choice >= 1 && choice <= 5) {
				System.out.println("Enter 1st number: ");
				num1 = sc.nextInt();
				System.out.println("Enter 2nd number");
				num2 = sc.nextInt();
			}

			switch (choice) {
			case 1:
				System.out.println("-- User choose to perform Addition --");
				System.out.println("Addition: " + (num1 + num2));
				break;
			case 2:
				System.out.println("-- User choose to perform Subtraction --");
				System.out.println("Subtraction: " + (num1 - num2));
				break;
			case 3:
				System.out.println("-- User choose to perform Multiplication --");
				System.out.println("Multiplication: " + (num1 * num2));
				break;
			case 4:
				System.out.println("-- User choose to perform Division --");
				System.out.println("Division: " + (num1 / num2));
				break;
			case 5:
				System.out.println("-- User choose to perform Modulus --");
				System.out.println("Modulus: " + (num1 % num2));
				break;
			case 6:
				System.out.println("-- User want to Exit --");
				flag = false;
				break;
			default:
				System.out.println("Invalid Choice, Try Again !!!");
			}

		} while (flag);
		System.out.println("---- Application End ----");

	}

}