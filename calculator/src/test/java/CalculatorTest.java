import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(8, 3);
    }

    @Test
    public void getNum1(){
        assertEquals(8, calculator.getNum1(), 0.01);
    }

    @Test
    public void getNum2(){
        assertEquals(3, calculator.getNum2(), 0.01);
    }

    @Test
    public void add(){
        assertEquals(11, calculator.getNum1() + calculator.getNum2(), 0.01);
    }

    @Test
    public void subtract(){
        assertEquals(5, calculator.getNum1() - calculator.getNum2(), 0.01);
    }

    @Test
    public void multiply(){
        assertEquals(24, calculator.getNum1() * calculator.getNum2(), 0.01);
    }

    @Test
    public void divide(){
        assertEquals(2.67, calculator.getNum1() / calculator.getNum2(), 0.01);
    }
}
