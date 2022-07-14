package Division;
import Exception.MismatchException;
import java.util.Scanner;
public class division_menu
{
    Scanner input = new Scanner(System.in);
    public void div_func()
    {
        System.out.println("\nPlease enter the first number: ");
        float first = 0;
        float second = 0;
        if(input.hasNextFloat())
        {
            first = input.nextFloat();
        }
        else
        {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }

        System.out.println("\nPlease enter the second number: ");
        if(input.hasNextFloat())
        {
            second = input.nextFloat();
        }
        else
        {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }
        div_op inst = new div_op(first, second);
        inst.perform();
        print_division print = new print_division(inst);
        print.print_calc();
    }
}