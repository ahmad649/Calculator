package CalculatorFactory;
import Abstract.CalcOps;
import Addition.AddOp;
import Division.DivOp;
import Multiplication.MulOp;
import Subtraction.SubOp;
public class SimpleCalculationFactory extends AbstractCalcFactory
{

    @Override
    public CalcOps selectCalculation(int option)
    {
        switch (option)
        {
            case 0:
                System.exit(0);
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
