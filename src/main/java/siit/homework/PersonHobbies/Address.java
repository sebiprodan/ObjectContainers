package siit.homework.PersonHobbies;

public class Address {

    String location;

    public Address (String location){
        this.location = location;
    }

    @Override
    public String toString() {
        return this.location;
    }
}
