package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd()
    {
        myCalc = new Calculator();
        assertEquals(40, myCalc.add(20,20));
    }

    @Test
    public void testSubtract()
    {
        myCalc= new Calculator();
        assertEquals(0,myCalc.subtract(30,30));
    }


    @Test
    public void testMultiply(){
        myCalc= new Calculator();
        assertEquals(35,myCalc.multiply(7,5));
    }


}
