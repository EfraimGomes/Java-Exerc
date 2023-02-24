package seminarsRegistration.test;
import seminarsRegistration.domain.PlaceAddress;
import seminarsRegistration.domain.Seminar;
import seminarsRegistration.domain.Student;
import seminarsRegistration.domain.Teacher;

public class RegistrationTest {
    public static void main(String[] args) {

        PlaceAddress placeAddress  = new PlaceAddress("Victoria Street London");

        Student student01 = new Student("Lorena", 21);
        Student student02 = new Student("Amanda", 25);
        Student student03 = new Student("katy", 20);
        Student student04 = new Student("Linda", 18);
        Student[] studentsSeminar = new Student[]{student01,student02,student03,student04};

        Teacher teacher01 = new Teacher("Allan","English");

        Seminar seminar = new Seminar("How to learn a new Language",studentsSeminar,placeAddress);
        Seminar[] seminarsAvailable = new Seminar[]{seminar};

        teacher01.setSeminar(seminarsAvailable);

        teacher01.print();

    }

}
