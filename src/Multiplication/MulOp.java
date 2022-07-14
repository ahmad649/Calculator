package Multiplication;
import Abstract.*;

public class MulOp implements CalcOp
{
    @Override
    public float performCalc(float first, float second)
    {
        return first * second;
    }
}
