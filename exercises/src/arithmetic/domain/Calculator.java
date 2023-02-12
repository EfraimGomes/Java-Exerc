package arithmetic.domain;


public class Calculator {
    public void addition(int num1, int num2){
        System.out.println(num1 + num2);

    }
    public void subtraction(int num1, int num2){
        System.out.println(num1 - num2);


    }
    public void multiplication(int num1, int num2){
        System.out.println(num1 * num2);

    }
    public void division(double num1, double num2){
        if (num2 == 0){
            System.out.println("There is no division by zero");
        }else {
            System.out.println(num1 / num2);
        }


    }
}
