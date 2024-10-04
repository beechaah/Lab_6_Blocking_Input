import java.util.Scanner;

public class CtoFConvertor
{
    public static void main(String[] args)
    {
        double celsius = 0;
        double fahrenheit = 0;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        String trash = "";

        do
        {
            System.out.print("Enter the temperature in celsius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said the temp in celsius was: " + trash);
                System.out.println("Retry and enter a valid input!");
            }

        } while(!done);

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

    }
}