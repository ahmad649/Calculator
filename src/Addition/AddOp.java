package Addition;

import Abstract.*;

public class AddOp implements CalcOp
{
    @Override
    public float performCalc(float first, float second)
    {
        return first + second;
    }
}