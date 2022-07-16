package Division;
import Abstract.*;
import Exception.DivException;

public class DivOp implements CalcOps
{
    DivisionMenu divMenu = new DivisionMenu();
    double[] inputs = divMenu.div_func();
    @Override
    public double performCalc() throws DivException
    {
        if(inputs[1] == 0)
        {
            throw new DivException("Cannot divide by zero");
        }
        else
        {
            return inputs[0] / inputs[1];
        }
    }
}