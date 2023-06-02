package ch.zhaw.iwi.devops.fizzbuzz.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.calculator.Calculator;

public class CalculatorTest {


    //Addition
    @Test
    public void testCalculateAdd() {
        Assertions.assertEquals(5, Calculator.calculate(2, 3, "add"));
    }
}

