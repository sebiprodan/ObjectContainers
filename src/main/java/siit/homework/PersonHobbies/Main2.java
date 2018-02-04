package siit.homework.PersonHobbies;

import siit.homework.PersonSortNameAge.Person;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        Map<Hobby, Address> listOfHobbies = new HashMap<Hobby, Address>();

        listOfHobbies.put(new Hobby("Alergat", 3), new Address("Baza 2"));
        listOfHobbies.put(new Hobby("Gimnastica", 1), new Address("SmartFit"));
        listOfHobbies.put(new Hobby("Zumba", 2), new Address("Calea Sagului"));

        System.out.println(listOfHobbies);
    }
}
