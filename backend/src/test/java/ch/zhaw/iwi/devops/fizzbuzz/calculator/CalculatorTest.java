package ch.zhaw.iwi.devops.fizzbuzz.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    //Addition
    @Test
    public void testCalculateAdd() {
        Assertions.assertEquals(5, Calculator.calculate(2, 3, "add"));
    }
}

