import java.util.Scanner;

public class DoWhileLoops {
	
	public static void doWhileLoops() {
		
		Scanner userInput = new Scanner(System.in);

		// For loops
		// Program to print 10 even numbers and 10 odd numbers.
		System.out.println("---Do While loops---");
		System.out.println("");
		System.out.println("First 10 even numbers");
		int i = 1;
		do {

			if (i % 2 == 0) {

				System.out.println(i);

			}
			
			i++;

		} while ( i < 21 );

		System.out.println("First 10 odd numbers");
		i = 1;
		do {

			if (i % 2 == 1) {

				System.out.println(i);

			}
			
			i++;

		} while ( i < 21 );

		// factorial of a number
		System.out.println("Please enter an integer for factorial.");
		int iFactorial = userInput.nextInt();
		userInput.nextLine();
		int numberFactorial = 1;
		
		i = 1;
		do {

			numberFactorial = numberFactorial * i;
			i++;

		} while ( i <= iFactorial );

		System.out.println(numberFactorial);

		//generate tables of 10
		System.out.println("Generate tables of 10 (0 to 12 x 10)");
		
		i = 0;
		do {

			int iTimes = 10 * i;
			System.out.println("10 x " + i + " = " + iTimes);
			i++;

		} while ( i < 13 );

		//add the digits of a number.
		System.out.println("Add the digits of an integer.");
		
		System.out.println("Please enter an integer number.");
		int numberSum = userInput.nextInt();
		userInput.nextLine();

		int iPower;
		int iDigit;
		int iDigitSum = 0;

		i = 1;
		do {

			iPower = (int) Math.pow(10, i);
			iDigit = numberSum % iPower;

			numberSum = numberSum - iDigit;

			iDigit = iDigit / (iPower / 10);
			iDigitSum = (int) (iDigitSum + iDigit);
			
			i++;

		} while ( numberSum > 0 );

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

		i = 0;
		do {
			
			numberCharactersReversed[numberLastIndex - i] = numberCharacters[i];
			i++;
			
		} while ( i < numberLength );
			


		String numberStringReversed = String.copyValueOf(numberCharactersReversed);

		System.out.println(numberStringReversed);

		// generate 10 Fibonacci numbers
		System.out.println("Generate 10 Fibonacci numbers.");
		int num1 = 0;
		int num2 = 1;
		int numFibonacci;

		System.out.println(num1);
		System.out.println(num2);

		i = 2;
		do {

			numFibonacci = num1 + num2;
			System.out.println(numFibonacci);

			num1 = num2;
			num2 = numFibonacci;
			
			i++;


		} while (  i < 11 );

		
	}

}

