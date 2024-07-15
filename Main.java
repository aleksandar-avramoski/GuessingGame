import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static int correctAnswer = (int) (Math.random() * 1000);
    public static int minGuess = 1;
    public static int maxGuess = 1000;
    public static int guess;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! \nWelcome to our new game,called 'Guessing game'! \nYou should answer the correct" + " " +
                "number from the random numbers. \nGood luck!");

        do {

            System.out.println("Guess the number between 0 and 1000!");

            System.out.println("Enter the number:");

            int guess = scanner.nextInt();

            if (minGuess >= 1 && maxGuess <= 1000) {

                if (guess > correctAnswer) {
                    System.out.println("Lower");
                    maxGuess = guess - 1;
                } else if (guess < correctAnswer) {
                    System.out.println("Higher");
                    minGuess = guess + 1;
                } else if (guess == correctAnswer) {
                    System.out.println("Correct");
                    System.out.println("Coungratulations!");
                    System.out.println("You win the game!");
                }
            }
        }
            while (guess != correctAnswer) ;
    }
}
