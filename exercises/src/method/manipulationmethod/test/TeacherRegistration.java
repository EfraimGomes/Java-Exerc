package method.manipulationmethod.test;

import method.manipulationmethod.domain.Teacher;

public class TeacherRegistration {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Amelly";
        teacher.schoolSubject = "English";
        teacher.age = 25;
        teacher.gender = 'F';
        teacher.printTeacher();




    }
}
