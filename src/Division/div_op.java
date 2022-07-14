package Division;
import Abstract.*;
import Exception.div_exception;

public class div_op extends calc_op
{
    public div_op( float first, float second) throws div_exception
    {
        if(second == 0)
        {
            throw new div_exception("Cannot divide by zero");
        }
        else
        {
            this.first = first;
            this.second = second;
        }
    }
    @Override
    public void perform()
    {
        result = first / second;
/*        try{
            if(second != 0) {
                result = first / second;
            }
        }catch (div_exception e)
        {
            System.out.println("Cannot divide a number by zero\n");
        }*/

    }
}
