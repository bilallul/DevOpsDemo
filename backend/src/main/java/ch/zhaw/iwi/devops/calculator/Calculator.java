package ch.zhaw.iwi.devops.calculator;

public class Calculator {

    public static int calculate(int a, int b, String operation) {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }

    }
}
