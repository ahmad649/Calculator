package Tangent;
import java.util.Scanner;
import Exception.MismatchException;
public class TanMenu
{
    Scanner input = new Scanner(System.in);

    public double TanFunc() {
        System.out.println("\nPlease enter a number: ");
        double UserValue;
        if (input.hasNextFloat()) {
            UserValue = input.nextFloat();
        } else {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }
        System.out.print("The tangent of " + UserValue + " = ");
        return UserValue;
    }
}
