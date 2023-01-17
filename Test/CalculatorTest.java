import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum()
    {
        Calculator obj=new Calculator();
        int result=obj.Sum(2,2);
        assertEquals(4,result);
    }

    @Test
    public void subtract()
    {
        Calculator obj=new Calculator();
        int result=obj.subtract(5,2);
        assertEquals(3,result);
    }



    @Test
    public void multiply()
    {
        Calculator obj=new Calculator();
        int result=obj.multiply(3,2);
        assertEquals(6,result);
    }

    @Test
    public void division()
    {
        Calculator obj=new Calculator();
        int result=obj.division(8,2);
        assertEquals(4,result);
    }
}