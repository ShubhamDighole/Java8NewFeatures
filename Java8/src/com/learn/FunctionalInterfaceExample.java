package com.learn;

import java.util.Scanner;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Calculator add = (numb1, numb2, numb3) -> numb1 + numb2 + numb3;

		Calculator sub = (numb1, numb2, numb3) -> numb1 - numb2;

		Calculator multiplication = (numb1, numb2, numb3) -> numb1 * -numb2 * numb3;

		System.out.println("Please provide which operation do you want to perform");
		Scanner scan = new Scanner(System.in);
		int inputOption = scan.nextInt();

		System.out.print("Please write the first input number you want : ");

		int inputNumber1 = scan.nextInt();
		System.out.println();

		System.out.print("Please write the Second input number you want : ");
		int inputNumber2 = scan.nextInt();
		System.out.println();

		System.out.print("Please write the Third input number you want : ");
		int inputNumber3 = scan.nextInt();

		switch (inputOption) {

		case 1: {

			Integer addition = add.doFunction(inputNumber1, inputNumber2, inputNumber3);
			System.out.println(addition);
		}
			break;
		case 2: {

			Integer substraction = sub.doFunction(inputNumber1, inputNumber2, inputNumber3);

			System.out.println(substraction);
		}
			break;
		case 3: {

			Integer multiply = multiplication.doFunction(inputNumber1, inputNumber2, inputNumber3);

			System.out.println(multiply);
		}
			break;
		default: {
			System.err.println("Wrong input taken..!!");
		}
		}
	}
}
