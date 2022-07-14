import Addition.addition_menu;
import Division.division_menu;
import Multiplication.multiplication_menu;
import Subtraction.subtraction_menu;
import java.util.Scanner;
import Exception.MismatchException;

public class Main
{
    protected static void main_menu_print()
    {
        System.out.println("*****CALCULATOR*****\n");
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
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addition_menu add = new addition_menu();
                    add.addition_func();
                    break;
                case 2:
                    subtraction_menu sub = new subtraction_menu();
                    sub.sub_func();
                    break;
                case 3:
                    multiplication_menu mul = new multiplication_menu();
                    mul.mul_func();
                    break;
                case 4:
                    division_menu div = new division_menu();
                    div.div_func();
                    break;
            }
        }while (choice !=0);
    }
    public static void main(String[] args) {
        main_menu();
    }
}