package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") String number1, @RequestParam("num2") String number2) {
        return calculatorService.plus(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") String number1, @RequestParam("num2") String number2) {
        return calculatorService.minus(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") String number1, @RequestParam("num2") String number2) {
        return calculatorService.multiply(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") String number1, @RequestParam("num2") String number2) {
        return calculatorService.divide(number1, number2);
    }


}
