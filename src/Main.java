import Abstract.PrintOp;
import Abstract.CalcOps;
import CalculatorFactory.AbstractCalcFactory;
import CalculatorFactory.FactoryProducer;
import java.util.Scanner;
import Exception.MismatchException;
public class Main
{
    protected static void SimpleMenuPrint()
    {
        System.out.println("0. Exit");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Please select from one of the choices (0-4) : \n");
    }
    protected static void ScientificMenuPrint()
    {
        System.out.println("0. Exit");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("Please select from one of the choices (0-3) : \n");
    }
    protected static void MainMenuPrint()
    {
        System.out.println("\n*****CALCULATOR*****\n");
        System.out.println("0. Exit");
        System.out.println("1. Simple Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.println("Please select from one of the choices (0-2) : \n");
    }
    protected static int SimpleMenu() {
        int choice;
        SimpleMenuPrint();
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            choice = input.nextInt();
        } else {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }

        while (!(choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4)) {
            System.out.println("\n\nWrong input entered !!\nPlease enter option (0-4)\n");
            SimpleMenuPrint();
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                throw new MismatchException("Calculations can only be performed on Integers!");
            }
        }
        return choice;
    }
    protected static int ScientificMenu()
    {
        int choice;
        ScientificMenuPrint();
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            choice = input.nextInt();
        } else {
            throw new MismatchException("Calculations can only be performed on Integers!");
        }
        while (!(choice == 0 || choice == 1 || choice == 2 || choice == 3 )) {
            System.out.println("\n\nWrong input entered !!\nPlease enter option (0-3)\n");
            ScientificMenuPrint();
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                throw new MismatchException("Calculations can only be performed on Integers!");
            }
        }
        return choice;
    }
    protected static void MainMenu()
    {
        int choice ;
        do {
            MainMenuPrint();
            Scanner input = new Scanner(System.in);
            if(input.hasNextInt())
            {
                choice = input.nextInt();
            }
            else
            {
                throw new MismatchException("Calculations can only be performed on Integers!");
            }
            while (!(choice == 0 || choice == 1 || choice == 2)) {
                System.out.println("\n\nWrong input entered !!\nPlease enter option (0-2)\n");
                MainMenuPrint();
                choice = input.nextInt();
            }
            PrintOp print = new PrintOp();
            CalcOps calcOps;
            AbstractCalcFactory calcFactory;
            CalcOps Calc1;
            int option;
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    calcFactory = FactoryProducer.getFactory(false);
                    option = SimpleMenu();
                    Calc1 = calcFactory.selectCalculation(option);
                    print.performPrint(Calc1.performCalc());
                    break;
                case 2:
                    calcFactory = FactoryProducer.getFactory(true);
                    option = ScientificMenu();
                    Calc1 = calcFactory.selectCalculation(option);
                    print.performPrint(Calc1.performCalc());
                    break;
            }
        }while (choice !=0);
    }
    public static void main(String[] args) {
        MainMenu();
    }
}