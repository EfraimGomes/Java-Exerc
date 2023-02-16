package method.manipulationmethod.test;

import method.manipulationmethod.domain.Student;
import method.manipulationmethod.domain.Teacher;

public class Registration {

    public static void main(String[] args) {
        teacherRegistration();

        Student student = new Student();
        student.setName("Efraim");
        student.setAge(29);
        student.setGender('M');
        student.print();
    }

    public static void teacherRegistration() {
        Teacher teacher = new Teacher();
        teacher.setName("Amelly");
        teacher.setSchoolSubject("English");
        teacher.setAge(25);
        teacher.setGender('F');
        teacher.print();
    }
}
