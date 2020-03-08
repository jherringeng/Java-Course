package maths.functions;

import java.util.Scanner;

public class MathsFunctions {
	
	Scanner mathInput = new Scanner(System.in);
	
	public void subtract() {
		System.out.println("\nSubtraction: ");
		System.out.println("Please enter first number: ");
		float firstNum = mathInput.nextFloat();
		mathInput.nextLine();
		
		System.out.println("Please enter second number: ");
		float secondNum = mathInput.nextFloat();
		mathInput.nextLine();
		
		float result = firstNum - secondNum;
		
		System.out.println(firstNum +" - " + secondNum +" = " + result);
		
	}
	
	public void multiply() {
		
		System.out.println("\nMultiplication: ");
		System.out.println("Please enter first number: ");
		float firstNum = mathInput.nextFloat();
		mathInput.nextLine();
		
		System.out.println("Please enter second number: ");
		float secondNum = mathInput.nextFloat();
		mathInput.nextLine();
		
		float result = firstNum * secondNum;
		
		System.out.println(firstNum +" x " + secondNum +" = " + result);
		
	}
	
	public void divide() {
		
		System.out.println("\nDivision: ");
		System.out.println("Please enter first number: ");
		float firstNum = mathInput.nextFloat();
		mathInput.nextLine();
		
		System.out.println("Please enter second number: ");
		float secondNum = mathInput.nextFloat();
		mathInput.nextLine();
		
		float result;
		try {
			result = firstNum / secondNum;
			System.out.println(firstNum +" / " + secondNum +" = " + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void factorial() {
		
		System.out.println("\nFactorial: ");
		int firstNum;
		
		do {
			System.out.println("Please enter integer number more or equal to 0: ");
			firstNum = mathInput.nextInt();
			mathInput.nextLine();
		} while (firstNum < 0);
		
		int result = 1;
		
		if (firstNum == 0)
			result = 1;
		else for (int i = 1; i <= firstNum; i++) {
			
			result = result * i;
			
		}
		
		System.out.println(firstNum + "! = " + result);
		
	}

}
