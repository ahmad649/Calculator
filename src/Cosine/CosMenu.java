package Cosine;
import java.util.Scanner;
import Exception.MismatchException;
public class CosMenu
{
    Scanner input = new Scanner(System.in);

    public double CosFunc() {
        System.out.println("\nPlease enter a number: ");
        double UserValue;
        if(input.hasNextFloat())
        {
            UserValue = input.nextFloat();
        }
        else
        {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }
        System.out.print("The cosine of " + UserValue + " = " );
        return UserValue;
    }
}