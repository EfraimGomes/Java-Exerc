package method.exerciseemployee.test;

import method.exerciseemployee.domain.Employee;

public class Employeetest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Bruno");
        employee.setAge(25);
        employee.setWages(new double[]{1200.53,988.32,5800.32});


        employee.printEmployee();
        employee.printAverageSalary();
    }

}

