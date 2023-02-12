package method.manipulationmethod.test;
import method.manipulationmethod.domain.Student;
import method.manipulationmethod.domain.PrintStudent;

public class StudentRegistration {
    public static void main(String[] args) {

        Student stu = new Student();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        PrintStudent printStu = new PrintStudent();

        stu.name = "Efraim";
        stu.age = 29;
        stu.gender = 'M';

        stu1.name = "Pedro";
        stu1.age = 20;
        stu1.gender = 'M';

        stu2.name = "Henrique";
        stu2.age = 25;
        stu2.gender = 'M';

        stu3.name = "Marcus";
        stu3.age = 30;
        stu3.gender = 'M';

        printStu.print(stu);
        printStu.print(stu1);
        printStu.print(stu2);
        printStu.print(stu3);


    }

}
