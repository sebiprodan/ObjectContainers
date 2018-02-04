package siit.homework.PersonHobbies;

import java.util.List;

public class Hobby {

    String hobbyName;
    int frequency;

    public Hobby (String hobbyName, int frequency){
        this.hobbyName = hobbyName;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return this.hobbyName + " " + this.frequency + " sesiuni pe saptamana";
    }


}
