package Subtraction;
import java.util.Scanner;
import Exception.MismatchException;
public class subtraction_menu
{
    Scanner input = new Scanner(System.in);

    public void sub_func()
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

        sub_op inst = new sub_op(first, second);
        inst.perform();
        print_subtraction print = new print_subtraction(inst);
        print.print_calc();
    }
}