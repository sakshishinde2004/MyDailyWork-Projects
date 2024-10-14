
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int roundNumber = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            roundNumber++;
            int targetNumber = random.nextInt(100) + 1;  // Generate a number between 1 and 100
            int maxAttempts = 10;  // Maximum number of attempts
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("\n--- Round " + roundNumber + " ---");
            System.out.println("You have " + maxAttempts + " attempts to guess the number between 1 and 100.");

            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly in " + attempts + " attempts.");
                    totalScore += maxAttempts - attempts + 1;  // Award points based on attempts left
                    hasGuessedCorrectly = true;
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts! The correct number was: " + targetNumber);
            }

            System.out.println("Your current score is: " + totalScore);

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your final score is: " + totalScore);
        scanner.close();
    }
}
