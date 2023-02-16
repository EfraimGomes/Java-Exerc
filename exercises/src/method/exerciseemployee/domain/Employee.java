package method.exerciseemployee.domain;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Employee {
    private String name;
    private int age;
    private double[] wages;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wages=" + Arrays.toString(wages) +
                '}';
    }

    public void printEmployee(){
        System.out.println(this);

    }
    public void printAverageSalary(){
//        double average = Arrays.stream(wages).sum() / wages.length;
//        if (Double.isNaN(average)) {
//            System.out.println("No value found");
//        } else {
//            System.out.println(average);
//        }

        OptionalDouble optional = Arrays.stream(wages).average();
        if (optional.isPresent()) {
            System.out.println("Average wages= " +optional.getAsDouble());
        }
        else { System.out.println("No value found");}

        if (wages.length == 0) {
            System.out.println("No value found");
            return;
        }

//        double sumWage = 0;
//        for (double wage: wages) {
//            sumWage = sumWage + wage;
//       }
//        double average1 = sumWage / wages.length;
//        System.out.println(average1);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setWages(double[] wages) {
        this.wages = wages;
    }
    public double[] getWages() {
        return wages;
    }

}
