package method.manipulationmethod.domain;

public class Student extends Person {
    private String name;
    private int age;
    private char gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", gender=" + this.gender +
                '}';
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
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
