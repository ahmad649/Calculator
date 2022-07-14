package Addition;
import java.util.Scanner;
import Exception.MismatchException;
public class addition_menu
{
    Scanner input = new Scanner(System.in);
    public void addition_func()
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

        Add_op inst = new Add_op(first, second);
        inst.perform();
        print_addition print = new print_addition(inst);
        print.print_calc();
    }
}