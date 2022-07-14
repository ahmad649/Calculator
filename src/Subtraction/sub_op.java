package Subtraction;
import Abstract.*;

public class sub_op extends calc_op
{
    public sub_op( float first, float second)
    {
        this.first = first;
        this.second = second;
    }
    @Override
    public void perform()
    {
        result = first - second;
    }

}
