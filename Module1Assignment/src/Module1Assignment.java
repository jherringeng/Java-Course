import java.util.Scanner;

public class Module1Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check if a candidate is eligible for voting or not.");
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please Enter Your Age: ");
		int ageOfCandidate = userInput.nextInt();
		userInput.nextLine();
		
		if (ageOfCandidate < 0) {
			System.out.println("We're sorry; you have not been born yet. ");
		} else if (ageOfCandidate == 0) {
			System.out.println("We're sorry; try again when you stop wearing nappies. ");
		}else if (ageOfCandidate < 18) {
			System.out.println("We're sorry you are not old enough to vote. ");
		}  else {
			System.out.println("Please select who you want to vote for. ");
			System.out.println("Please don't vote for Trump! ");
		}
		
		System.out.println("Pick an integer number; any integer number.");
		int numberInput = userInput.nextInt();
		userInput.nextLine();
		
		if (numberInput < 0) {
			System.out.println("You entered a negative number. ");
		} else if (numberInput > 0) {
			System.out.println("You entered a positive number. ");
		} else {
			System.out.println("Zero is neither postitive or negative.-1 ");
		}
			
		
		System.out.println("Select your first number.");
		float number1Input = userInput.nextFloat();
		userInput.nextLine();
		
		System.out.println("Select your second number.");
		float number2Input = userInput.nextFloat();
		userInput.nextLine();
		
		if (number1Input > number2Input) {
			System.out.println("The first number is larger."); 
			System.out.println(number1Input + " > " + number2Input);
		} else if (number1Input < number2Input) {
			System.out.println("The second number is larger."); 
			System.out.println(number1Input + " < " + number2Input);
		} else {
			System.out.println("The numbers are equal."); 
			System.out.println(number1Input + " = " + number2Input);
		}

		System.out.println("Select an integer number to check whether it is odd or even.");
		int numberOddorEvenInput = userInput.nextInt();
		userInput.nextLine();
		int numberOddorEven = numberOddorEvenInput % 2;
		if (numberOddorEven == 1) {
			System.out.println("Number is odd.");
		} else {
				System.out.println("Number is even.");
		}
		
		ForLoops.forLoops();
		WhileLoops.whileLoops();
		DoWhileLoops.doWhileLoops();
		
		userInput.close();
		
	}
	
	
}
