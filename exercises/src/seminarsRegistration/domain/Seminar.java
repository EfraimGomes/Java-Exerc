package seminarsRegistration.domain;

public class Seminar {
    private String title;

    private Student[] students;

    private PlaceAddress placeAddress;

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar (String title, PlaceAddress placeAddress){
        this.title = title;
        this.placeAddress = placeAddress;
    }

    public Seminar(String title,Student[] students,PlaceAddress placeAddress) {
        this.title = title;
        this.students = students;
        this.placeAddress = placeAddress;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public PlaceAddress getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(PlaceAddress placeAddress) {
        this.placeAddress = placeAddress;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
