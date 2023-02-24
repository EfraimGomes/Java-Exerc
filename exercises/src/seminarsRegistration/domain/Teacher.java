package seminarsRegistration.domain;

public class Teacher {
    private String name;
    private String researchField;

    private Seminar[] seminar;


    public Teacher(String name) {
        this.name = name;
    }
    public Teacher(String name,String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Teacher(String name, String researchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminar = seminars;
    }

    public void print(){
        System.out.println("Teacher: " +this.name);
        System.out.println("Research Field: " +this.researchField);

        if (this.seminar == null)return;
        System.out.println("*** Seminars ***");
        for (Seminar seminar:
             this.seminar) {
            System.out.println("Title: "+seminar.getTitle());
            System.out.println("Address: " +seminar.getPlaceAddress().getAddress());
            if (seminar.getStudents() == null)continue;
            System.out.println("***Students***");
            for (Student student: seminar.getStudents()){
                System.out.println("Student: "+student.getName()+" ,Age: "+student.getAge());
            }
        }
    }

    public Seminar[] getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar[] seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }
}
