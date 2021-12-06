package vistula.kc.calculator_57248_chojnowski;

public class CalculatorTools {
    static int count(int n1, int n2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
        }
        return result;
    }
}
