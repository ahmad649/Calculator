package Subtraction;
import java.util.Scanner;
import Exception.MismatchException;
public class SubtractionMenu
{
    Scanner input = new Scanner(System.in);

    public double[] sub_func()
    {
        System.out.println("\nPlease enter the first number: ");
        double[] inputs = new double[2];
        if(input.hasNextFloat())
        {
            inputs[0] = input.nextFloat();
        }
        else
        {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }

        System.out.println("\nPlease enter the second number: ");
        if(input.hasNextFloat())
        {
            inputs[1] = input.nextFloat();
        }
        else
        {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }
        System.out.print("The subtraction of "+ inputs[0] + " - " + inputs[1] + " = " );
        return inputs;
    }
}
