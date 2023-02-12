package method.exerciseemployee.test;

import method.exerciseemployee.domain.Employee;

public class Employeetest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Bruno";
        employee.age = 25;
        employee.wages = new double[]{1200,988,5800};

        employee.printEmployee();
    }

}

