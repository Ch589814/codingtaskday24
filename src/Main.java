import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        // Define operations as BiFunction lambdas
        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;

        // Sample values
        int num1 = 10;
        int num2 = 5;

        // Test the calculate method with each operation
        System.out.println("Addition: " + num1 + " + " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, addition));

        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, subtraction));

        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, multiplication));

        System.out.println("Division: " + num1 + " / " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, division));
    }
}