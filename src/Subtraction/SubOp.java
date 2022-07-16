package Subtraction;
import Abstract.*;

public class SubOp implements CalcOps
{
    SubtractionMenu subMenu = new SubtractionMenu();
    double[] inputs = subMenu.sub_func();
    @Override
    public double performCalc()
    {
        return inputs[0] - inputs[1];
    }
}
