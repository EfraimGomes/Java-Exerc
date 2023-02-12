package arithmetic.test;

import arithmetic.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addition(10,10);
        calc.subtraction(10,8);
        calc.division(8,0);
        calc.division(8,4);
        calc.multiplication(5,5);

    }
}
