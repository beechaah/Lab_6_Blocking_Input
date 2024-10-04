import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double pythagoreanTheorem = 0;
        boolean donewidth = false;
        boolean doneheight = false;
        Scanner in = new Scanner(System.in);
        String trash = "";

        do
        {
            System.out.print("Enter the width: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                donewidth = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said the width was: " + trash);
                System.out.println("Retry and enter a valid input!");
            }

        } while(!donewidth);

        do
        {
            System.out.print("Enter the height: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                doneheight = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said the height was: " + trash);
                System.out.println("Retry and enter a valid input!");
            }

        } while(!doneheight);

        area = width * height;
        System.out.println("The area is " + area);
        perimeter = (width * 2) + (height * 2);
        System.out.println("The perimeter is " + perimeter);
        pythagoreanTheorem= Math.sqrt((width * width) + (height * height));
        System.out.println("The length of the hypotenuse is: " + pythagoreanTheorem);


    }
}