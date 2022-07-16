package Sine;
import java.util.Scanner;
import Exception.MismatchException;
public class SinMenu
{
    Scanner input = new Scanner(System.in);

    public double SinFunc() {
        System.out.println("\nPlease enter a number: ");
        double UserValue;
        if (input.hasNextFloat()) {
            UserValue = input.nextFloat();
        } else {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }
        System.out.print("The sine of " + UserValue + " = ");
        return UserValue;
    }
}
