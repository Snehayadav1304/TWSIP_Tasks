package twsip;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int minRange = 1;
	        int maxRange = 100;
	        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	        int maxAttempts = 5;
	        int attempts = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess a number between " + minRange + " and " + maxRange);

	        while (attempts < maxAttempts) //0<5
	        {
	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("Too low. Try again.");
	            } else {
	                System.out.println("Too high. Try again.");
	            }
	        }

	        if (attempts == maxAttempts) {
	            System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
	        }

	        scanner.close();
		
		
	}


}
