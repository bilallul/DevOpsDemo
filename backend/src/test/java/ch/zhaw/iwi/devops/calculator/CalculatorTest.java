package ch.zhaw.iwi.devops.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    //Addition
    @Test
    public void testCalculateAdd() {
        Assertions.assertEquals(5, Calculator.calculate(2, 3, "add"));
    }

    @Test
    public void testCalculateSubtract() {
        Assertions.assertEquals(2, Calculator.calculate(5, 3, "subtract"));
    }
}

