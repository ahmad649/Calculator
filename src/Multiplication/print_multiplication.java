package Multiplication;

public class print_multiplication
{
    mul_op mul;
    public print_multiplication(mul_op mul)
    {
        this.mul = mul;
    }
    public void print_calc()
    {
        System.out.println("The multiplication of " + mul.first +" * " + mul.second + " = " + mul.result);
    }
}