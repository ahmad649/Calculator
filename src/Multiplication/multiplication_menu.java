package Multiplication;
import java.util.Scanner;
import Exception.MismatchException;
public class multiplication_menu
{
    Scanner input = new Scanner(System.in);

    public void mul_func() {
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

        mul_op inst = new mul_op(first, second);
        inst.perform();
        print_multiplication print = new print_multiplication(inst);
        print.print_calc();
    }
}



