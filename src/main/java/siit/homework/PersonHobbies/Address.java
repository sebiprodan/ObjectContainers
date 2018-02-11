package siit.homework.PersonHobbies;
import java.util.*;

public class Address{

    String addressName;
    String townName;

    public Address (String addressName, String townName){
        this.addressName = addressName;
        this.townName = townName;
    }

    @Override
    public String toString() {
        return this.addressName + "/" + this.townName;
    }
}
