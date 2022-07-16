package CalculatorFactory;
import Abstract.CalcOps;
import Sine.SineOp;
import Cosine.CosineOp;
import Tangent.TangentOp;

public class ScientificCalculationFactory extends AbstractCalcFactory
{
    @Override
    public CalcOps selectCalculation(int option)
    {
        switch (option)
        {
            case 0:
                System.exit(0);
            case 1:
                return new SineOp();
            case 2:
                return new CosineOp();
            case 3:
                return new TangentOp();
        }
        return null;
    }
}
