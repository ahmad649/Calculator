package CalculatorFactory;
import Abstract.CalcOp;
import Addition.AddOp;
import Division.DivOp;
import Multiplication.MulOp;
import Subtraction.SubOp;

public class CalculationFactory
{
    public CalcOp selectCalculation(int option)
    {
        switch (option)
        {
            case 1:
                return new AddOp();
            case 2:
                return new SubOp();
            case 3:
                return new MulOp();
            case 4:
                return new DivOp();
        }
        return null;
    }
}
