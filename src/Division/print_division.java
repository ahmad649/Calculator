package Division;

public class print_division
{
    div_op div;
    public print_division(div_op div)
    {
        this.div = div;
    }
    public void print_calc()
    {
        System.out.println("The division of " + div.first +" / " + div.second + " = " + div.result);
    }

}
