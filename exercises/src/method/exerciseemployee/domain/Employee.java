package method.exerciseemployee.domain;

public class Employee {
    public String name;
    public int age;
    public double[] wages;

    public void printEmployee(){
        System.out.println(this.name);
        System.out.println(this.age);

        for (double wage: wages) {
            System.out.println((wage +" "));

        }

    }
    public void printaveragesalary(){

    }


}
