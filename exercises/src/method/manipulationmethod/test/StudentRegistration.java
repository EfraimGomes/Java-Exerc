package method.manipulationmethod.test;
import method.manipulationmethod.domain.Student;


public class StudentRegistration {
    public static void main(String[] args) {

        Student stu = new Student();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        stu.setName("Efraim");
        stu.setAge(29);
        stu.setGender('M');

        stu1.setName("Pedro");
        stu1.setAge(20);
        stu1.setGender('M');

        stu2.setName("Henrique");
        stu2.setAge(25);
        stu2.setGender('M');

        stu3.setName("Marcus");
        stu3.setAge(30);
        stu3.setGender('M');

        stu.print();
        stu1.print();
        stu2.print();
        stu3.print();


    }

}
