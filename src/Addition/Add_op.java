package Addition;

import Abstract.*;

public class Add_op extends calc_op
{
    public Add_op( float first, float second)
    {
        this.first = first;
        this.second = second;
    }
    @Override
    public void perform()
    {
        result = first + second;
    }
}