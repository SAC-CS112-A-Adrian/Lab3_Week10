import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double number1;
		double highNum;

		System.out.print("Please enter a high number: ");
		highNum = input.nextDouble();

		RandomNumber myRandomNumber = new RandomNumber(highNum);

		double randomNum = myRandomNumber.GetANumber();

		System.out.print("Please enter a number: ");
		number1 = input.nextDouble();

		if (number1 == randomNum)
			System.out.printf("Congrats, you guessed it. The correct number is %f\n", randomNum);
		else if (number1 > randomNum)
			System.out.printf("Your number is too large. The correct number is %f\n", randomNum);
		else
			System.out.printf("Your number is too small. The correct number is %f\n", randomNum);

	}

}