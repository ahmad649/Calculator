package Division;
import Abstract.*;
import Exception.DivException;

public class DivOp implements CalcOp
{
    @Override
    public float performCalc(float first, float second) throws DivException
    {
        if(second == 0)
        {
            throw new DivException("Cannot divide by zero");
        }
        else
        {
            return first / second;
        }
    }
}
