package Addition;

public class print_addition
{
    Add_op add;
    public print_addition(Add_op add)
    {
        this.add = add;
    }
    public void print_calc()
    {
        System.out.println("The sum of " + add.first +" + " + add.second + " = " + add.result);
    }
}
