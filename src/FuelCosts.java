import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        double capacity = 0;
        double mpg = 0;
        double ppg = 0;
        double Calculation = 0;
        double Calculation2 = 0;
        boolean doneMPG = false;
        boolean doneCapacity = false;
        boolean doneppg = false;
        boolean doneCalculation = false;
        String trash = "";
        Scanner in = new Scanner(System.in);


        do
        {
            do
            {
                System.out.print("Enter the amount of gallons your tank holds: ");
                if(in.hasNextDouble())
                {
                    capacity = in.nextDouble();
                    in.nextLine();
                    doneCapacity = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("\nYou said your capacity was: " + trash);
                    System.out.println("Retry and enter a valid input!");
                }
            } while(!doneCapacity);

            do
            {
                System.out.print("Enter the amount of miles you can go per gallon: ");
                if(in.hasNextDouble())
                {
                    mpg = in.nextDouble();
                    in.nextLine();
                    doneMPG = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("\nYou said your miles per gallon was: " + trash);
                    System.out.println("Retry and enter a valid input!");
                }
            } while(!doneMPG);

            do
            {
                System.out.print("Enter the price per gallon: ");
                if(in.hasNextDouble())
                {
                    ppg = in.nextDouble();
                    in.nextLine();
                    doneppg = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("\nYou said your price per gallon was: " + trash);
                    System.out.println("Retry and enter a valid input!");
                }
            } while(!doneppg);

            Calculation = mpg * ppg;
            System.out.println("Your Price to go " + Calculation2 + " miles is $" + Calculation);
            Calculation2 = mpg * capacity;
            System.out.println("With a full tank of gas your vehicle will go " + Calculation2 + " miles");
            doneCalculation = true;
        } while (!doneCalculation);
    }
}
