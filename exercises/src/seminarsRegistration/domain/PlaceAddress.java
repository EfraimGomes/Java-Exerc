package seminarsRegistration.domain;

public class PlaceAddress {
    private String address;

    private Seminar seminar;

    public PlaceAddress(String address){
        this.address = address;
    }

    public PlaceAddress(String address, Seminar seminar) {
        this.address = address;
        this.seminar = seminar;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

}
