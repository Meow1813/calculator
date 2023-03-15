package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String errorChecker(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка, недостаточно чисел";
        } else if (!isNumeric(num1) || !isNumeric(num2)) {
            return "Ошибка, введите число";
        }
        return null;
    }

    @Override
    public String plus(String num1, String num2) {
        String answer = errorChecker(num1, num2);
        if (answer == null) answer = num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
        return answer;
    }

    @Override
    public String minus(String num1, String num2) {
        String answer = errorChecker(num1, num2);
        if (answer == null) answer = num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
        return answer;
    }

    @Override
    public String multiply(String num1, String num2) {
        String answer = errorChecker(num1, num2);
        if (answer == null) answer = num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
        return answer;
    }

    @Override
    public String divide(String num1, String num2) {
        String answer;
        answer = errorChecker(num1, num2);
        if (num2 == "0") answer = "Ошибка, делить на ноль нельзя!";
        if (answer == null) answer = num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));
        return answer;
    }
}
