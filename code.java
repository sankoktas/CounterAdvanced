public class Counter
{
    private int value;
    public void click()
    {
        value++;
    }
    public void undo()
    {
        value--;
    }
    public void setLimit(int maximum)
    {
        if (value > maximum)
        {
            value = maximum;
        }
    }
    public int getValue()
    {
        if (value < 0)  
        {
         value = 0;
        }
        return value;
    }
    public void reset() 
    {
        value = 0;
    }
}
class CounterTest
{
   public static void main(String[] args)
    {
        Counter c1 = new Counter();
        c1.reset();
        c1.click();
        c1.click();
        c1.undo();
        c1.undo();
        c1.undo();
        System.out.println("Tally Count: "+ c1.getValue());
        c1.setLimit(3);
        c1.click();
        c1.click();
        c1.click();
        c1.click();
        System.out.println("Tally Count: "+ c1.getValue());
    } 
}
