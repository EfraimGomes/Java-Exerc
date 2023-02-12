package arithmetic.domain;

import java.util.Scanner;

public class ArithmeticCalc {
    public ArithmeticCalc() {
    }

    public void average() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number01 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double number02 = sc.nextDouble();
        System.out.println("Enter Third Number");
        double number03 = sc.nextDouble();
        double average = number01 + number02 + number03;
        System.out.println("total: " + average / 3.0);
    }
}
