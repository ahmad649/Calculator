package Multiplication;
import Abstract.*;

public class mul_op extends calc_op
{
    public mul_op( float first, float second)
    {
        this.first = first;
        this.second = second;
    }
    @Override
    public void perform()
    {
        result = first * second;
    }
}
