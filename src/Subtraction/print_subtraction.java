package Subtraction;

public class print_subtraction
{
    sub_op sub;
    public print_subtraction(sub_op sub)
    {
        this.sub = sub;
    }
    public void print_calc()
    {
        System.out.println("The subtraction of " + sub.first +" - " + sub.second + " = " + sub.result);
    }
}
