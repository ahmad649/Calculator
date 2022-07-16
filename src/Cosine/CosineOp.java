package Cosine;
import Abstract.CalcOps;
import static java.lang.Math.cos;

public class CosineOp implements CalcOps
{
    CosMenu cosMenu = new CosMenu();
    double Value = cosMenu.CosFunc();
    @Override
    public double performCalc()
    {
        return cos(Value);
    }
}
