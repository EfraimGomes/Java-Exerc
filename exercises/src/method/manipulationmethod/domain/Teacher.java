package method.manipulationmethod.domain;

public class Teacher {
    public String name;
    public String schoolSubject;
    public int age;
    public char gender;

    public void printTeacher(){
        System.out.println(this.name);
        System.out.println(this.schoolSubject);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
