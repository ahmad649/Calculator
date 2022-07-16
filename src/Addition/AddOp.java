package Addition;

import Abstract.*;

public class AddOp implements CalcOps
{
    AdditionMenu addMenu = new AdditionMenu();
    double[] inputs = addMenu.addition_func();

    @Override
    public double performCalc()
    {
        return inputs[0] + inputs[1];
    }
}