import Abstract.PrintOp;
import Abstract.CalcOp;
import Addition.*;
import Division.*;
import Multiplication.*;
import Subtraction.*;
import java.util.Scanner;
import Exception.MismatchException;
import CalculatorFactory.CalculationFactory;
public class Main
{
    protected static void main_menu_print()
    {
        System.out.println("\n*****CALCULATOR*****\n");
        System.out.println("0. Exit");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Please select from one of the choices (0-4) : \n");
    }
    protected static void main_menu()
    {
        int choice ;
        do {
            main_menu_print();
            Scanner input = new Scanner(System.in);
            if(input.hasNextFloat())
            {
                choice = input.nextInt();
            }
            else
            {
                throw new MismatchException("Calculations can only be performed on Integers!");
            }

            while (!(choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4)) {
                System.out.println("\n\nWrong input entered !!\nPlease enter option (0-4)\n");
                main_menu_print();
                choice = input.nextInt();
            }
            CalculationFactory calculationFactory = new CalculationFactory();
            PrintOp print = new PrintOp();
            CalcOp calcOp;
            float[] inputs;
            float output;
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    calcOp = calculationFactory.selectCalculation(choice);
                    AdditionMenu add = new AdditionMenu();
                    inputs = add.addition_func();
                    output = calcOp.performCalc(inputs[0],inputs[1]);
                    print.performPrint(output);
                    break;
                case 2:
                    calcOp = calculationFactory.selectCalculation(choice);
                    SubtractionMenu sub = new SubtractionMenu();
                    inputs = sub.sub_func();
                    output = calcOp.performCalc(inputs[0],inputs[1]);
                    print.performPrint(output);
                    break;
                case 3:
                    calcOp = calculationFactory.selectCalculation(choice);
                    MultiplicationMenu mul = new MultiplicationMenu();
                    inputs = mul.mul_func();
                    output = calcOp.performCalc(inputs[0],inputs[1]);
                    print.performPrint(output);
                    break;
                case 4:
                    calcOp = calculationFactory.selectCalculation(choice);
                    DivisionMenu div = new DivisionMenu();
                    inputs = div.div_func();
                    output = calcOp.performCalc(inputs[0],inputs[1]);
                    print.performPrint(output);
                    break;
            }
        }while (choice !=0);
    }
    public static void main(String[] args) {
        main_menu();
    }
}