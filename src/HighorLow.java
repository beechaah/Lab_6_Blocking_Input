import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;
        int userGuess = 0;

        System.out.print("Guess a number between 1 and 10: ");

        do
        {
            while (!in.hasNextInt())
            {
                System.out.print("Invalid input, please enter an integer between 1 and 10: ");
                in.next();
            }
            userGuess = in.nextInt();
            if (userGuess < 1 || userGuess > 10)
            {
                System.out.print("That's not a valid number, please enter a number between 1 and 10: ");
            }
        } while (userGuess < 1 || userGuess > 10);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess < randomNumber)
        {
            System.out.println("Your guess was too low!");
        }
        else if (userGuess > randomNumber)
        {
            System.out.println("Your guess was too high!");
        }
        else
        {
            System.out.println("You guessed it! On the money!");
        }
    }
}