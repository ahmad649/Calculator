package Tangent;
import Abstract.CalcOps;
import static java.lang.Math.tan;

public class TangentOp  implements CalcOps
{
    TanMenu tanMenu = new TanMenu();
    double Value = tanMenu.TanFunc();
    @Override
    public double performCalc()
    {
        return tan(Value);
    }
}
