import java.util.Scanner;

public class ForLoops {

	public static void forLoops() {
		
		Scanner userInput = new Scanner(System.in);

		// For loops
		// Program to print 10 even numbers and 10 odd numbers.
		System.out.println("---For loops---");
		System.out.println("");
		System.out.println("First 10 even numbers");
		for (int i = 1; i < 21; i++) {

			if (i % 2 == 0) {

				System.out.println(i);

			}

		}

		System.out.println("First 10 odd numbers");
		for (int i = 1; i < 21; i++) {

			if (i % 2 == 1) {

				System.out.println(i);

			}

		}

		// factorial of a number
		System.out.println("Please enter an integer for factorial.");
		int iFactorial = userInput.nextInt();
		userInput.nextLine();
		int numberFactorial = 1;
		
		for (int i = 1; i <= iFactorial; i++) {

			numberFactorial = numberFactorial * i;

		}

		System.out.println(numberFactorial);

		//generate tables of 10
		System.out.println("Generate tables of 10 (0 to 12 x 10)");
		for (int i = 0; i < 13; i++) {

			int iTimes = 10 * i;
			System.out.println("10 x " + i + " = " + iTimes);

		}

		//add the digits of a number.
		System.out.println("Add the digits of an integer.");
		
		System.out.println("Please enter an integer number.");
		int numberSum = userInput.nextInt();
		userInput.nextLine();

		int iPower;
		int iDigit;
		int iDigitSum = 0;

		for (int i = 1; numberSum > 0; i++) {

			iPower = (int) Math.pow(10, i);
			iDigit = numberSum % iPower;

			numberSum = numberSum - iDigit;

			iDigit = iDigit / (iPower / 10);
			iDigitSum = (int) (iDigitSum + iDigit);


		}

		System.out.println("Addition of digits = " + iDigitSum);

		//Reverse the digits of a number.
		System.out.println("Reverse the digits of a number (uses float)");
		float numberToReverse = userInput.nextFloat();
		userInput.nextLine();
		
		String numberString = Float.toString(numberToReverse); 

		int numberLength = numberString.length();
		int numberLastIndex = numberLength - 1;

		char[] numberCharacters = new char[numberLength];
		char[] numberCharactersReversed = new char[numberLength];
		numberString.getChars(0, numberLength, numberCharacters, 0);


		for (int i = 0; i < numberLength; i++) 
			numberCharactersReversed[numberLastIndex - i] = numberCharacters[i];


		String numberStringReversed = String.copyValueOf(numberCharactersReversed);

		System.out.println(numberStringReversed);

		// generate 10 Fibonacci numbers
		System.out.println("Generate 10 Fibonacci numbers.");
		int num1 = 0;
		int num2 = 1;
		int numFibonacci;

		System.out.println(num1);
		System.out.println(num2);


		for (int i = 2; i < 11; i++) {

			numFibonacci = num1 + num2;
			System.out.println(numFibonacci);

			num1 = num2;
			num2 = numFibonacci;


		}


	}

}
