package Division;
import Exception.MismatchException;
import java.util.Scanner;
public class DivisionMenu
{
    Scanner input = new Scanner(System.in);
    public double[] div_func()
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
        System.out.print("The division of "+ inputs[0] + " / " + inputs[1] + " = " );
        return inputs;
    }
}