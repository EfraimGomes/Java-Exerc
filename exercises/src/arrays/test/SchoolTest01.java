package arrays.test;

import arrays.domain.School;
import arrays.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Teacher Henry");
        Teacher teacher01 = new Teacher("Teacher Harry");
        Teacher[] teachers = {teacher,teacher01};
        School school = new School("Oxford",teachers );

        school.print();

    }
}
