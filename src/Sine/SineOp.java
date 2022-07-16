package Sine;
import Abstract.CalcOps;
import static java.lang.Math.sin;

public class SineOp implements CalcOps
{
    SinMenu sinMenu = new SinMenu();
    double Value = sinMenu.SinFunc();
    @Override
    public double performCalc()
    {
        return sin(Value);
    }
}
