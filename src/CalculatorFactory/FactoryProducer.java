package CalculatorFactory;

public class FactoryProducer
{
    public static AbstractCalcFactory getFactory(boolean Scientific){
        if(Scientific){
            return new ScientificCalculationFactory();
        }else{
            return new SimpleCalculationFactory();
        }
    }
}