package Subtraction;
import Abstract.*;

public class SubOp implements CalcOp
{
    @Override
    public float performCalc(float first, float second)
    {
        return first - second;
    }
}
