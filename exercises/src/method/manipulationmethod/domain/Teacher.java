package method.manipulationmethod.domain;

public class Teacher extends Person {
    private String name;
    private String schoolSubject;
    private int age;
    private char gender;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolSubject='" + schoolSubject + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSchoolSubject(String schoolSubject){
        this.schoolSubject = schoolSubject;
    }

    public String getSchoolSubject(){
        return this.schoolSubject;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return this.gender;
    }
}
