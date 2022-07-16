package Multiplication;
import Abstract.*;

public class MulOp implements CalcOps
{
    MultiplicationMenu mulMenu = new MultiplicationMenu();
    double[] inputs = mulMenu.mul_func();
    @Override
    public double performCalc()
    {
        return inputs[0] * inputs[1];
    }
}
