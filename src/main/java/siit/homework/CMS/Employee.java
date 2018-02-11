package siit.homework.CMS;

public class Employee {

    String name;
    double seniority;
    String role;
    boolean parking;

    public Employee(String name, String role, double seniority, boolean parking){

        this.name = name;
        this.role = role;
        this.seniority = seniority;
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "|Role: " + this.role + "|Seniority: " +this.seniority;
    }

    public void noParking(){
        if (parking = false){

        }
    }
}
