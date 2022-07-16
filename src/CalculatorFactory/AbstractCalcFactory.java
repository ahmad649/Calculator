package CalculatorFactory;

import Abstract.CalcOps;

public abstract class AbstractCalcFactory
{
    public abstract CalcOps selectCalculation(int option);
}
