package pro.sky.calculator;

public interface CalculatorService {
    String errorChecker(String num1, String num2);

    String plus(String num1, String num2);

    String minus(String num1, String num2);

    String multiply(String num1, String num2);

    String divide(String num1, String num2);
}
